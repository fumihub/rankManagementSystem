package presenter;

import java.util.HashMap;

import model.JavaConnection;
import view.Chat;
import view.DiamondUser;
import view.FunctionView;
import view.GoldUser;
import view.LogOut;
import view.MypageView;
import view.NormalUser;
import view.PlayingGame;
import view.PremiumUser;
import view.Purchase;
import view.Search;
import view.Selling;
import view.SilverUser;

public class ManagementSystem {
	//DBとの接続
	private JavaConnection db = JavaConnection.getInstance();
	//ログイン情報を取得
	private static LoginPresenter lp = LoginPresenter.getInstance();
	//UserModelクラスでランクを格納
	public static String rank;
	//MypageViewクラスでセレクションを格納
	public static int selection;

	public static void main (String args[]) {
		//マイページ画面用ハッシュマップ
		HashMap<String, MypageView> map = new HashMap<String, MypageView>();
		//機能画面用配列
		FunctionView fv[] = new FunctionView[6];

		//各ランクのマイページクラスを格納
		map.put("Normal", new NormalUser());
		map.put("Silver", new SilverUser());
		map.put("Gold", new GoldUser());
		map.put("Premium", new PremiumUser());
		map.put("Diamond", new DiamondUser());

		//各機能画面クラスを格納
		fv[0] = new LogOut();
		fv[1] = new Search();
		fv[2] = new Purchase();
		fv[3] = new Selling();
		fv[4] = new Chat();
		fv[5] = new PlayingGame();

		while (true) {
			//ログイン処理
			lp.login();
			//各ランクマイページ表示
			map.get(rank).excute();
			//各機能ページ表示
			fv[selection].excute();

			//ログイン画面に戻る
			if (selection == 6) {
				continue;
			}
			//システムを終了する
			else if (selection == 7) {
				break;
			}
		}
	}
}
