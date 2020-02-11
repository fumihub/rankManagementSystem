package view;

import java.util.Scanner;

import presenter.ManagementSystem;

//ダイヤモンドランククラス
public class DiamondUser extends MypageView implements ISearch,
IPerchace, ISelling, IChat, IPlayingGame{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public DiamondUser(String rank){
		super(rank);
	}

	public void excute(){
		//ランクの表示
		System.out.println("RANK : " + super.getName());
		System.out.println("");
		System.out.println("0 : ログアウトする");
		System.out.println("1 : 商品を探す");
		System.out.println("2 : 商品を購入する");
		System.out.println("3 : 商品を売却する");
		System.out.println("4 : チャットして遊ぶ");
		System.out.println("5 : ゲームをして遊ぶ");

		ManagementSystem.selection = scanner.nextInt();

	}

	@Override
	public String playingGame() {
		// TODO 自動生成されたメソッド・スタブ
		return "ゲームをお選びください。。";
	}

	@Override
	public String chat() {
		// TODO 自動生成されたメソッド・スタブ
		return "チャットする相手をお選びください。";
	}

	@Override
	public String selling() {
		// TODO 自動生成されたメソッド・スタブ
		return "お売りになる商品を登録してください。";
	}

	@Override
	public String perchace() {
		// TODO 自動生成されたメソッド・スタブ
		return "購入する商品をお選びください。";
	}

	@Override
	public String search() {
		// TODO 自動生成されたメソッド・スタブ
		return "お探しの商品は何ですか？";
	}


}
