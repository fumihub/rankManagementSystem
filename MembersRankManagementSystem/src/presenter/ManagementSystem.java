package presenter;
import java.io.IOException;
import java.util.HashMap;

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
			//クリアスクリーン
			clrscr();

			//ログイン処理
			lp.login();

			//クリアスクリーン
			clrscr();

			//各ランクマイページ表示
			map.get(rank).excute();

			//クリアスクリーン
			clrscr();

			//各機能ページ表示
			fv[selection].excute();

			//クリアスクリーン
			clrscr();

			//ログアウト画面の表示
			fv[selection].excute();

			//ログイン画面に戻る
			if (selection == 6) {
				continue;
			}
			//システムを終了する
			else if (selection == 7) {
				System.exit(0);
			}
		}
	}

	public static void clrscr(){
		//Clears Screen in java
		try {
		    if (System.getProperty("os.name").contains("Windows")) {
		        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		    }
		    else {
		        Runtime.getRuntime().exec("clear");
		    }
		} catch (IOException | InterruptedException ex) {}
		}
}
