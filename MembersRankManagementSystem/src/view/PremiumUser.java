package view;

import java.util.Scanner;

import presenter.ManagementSystem;

//プレミアムランククラス
public class PremiumUser extends MypageView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public PremiumUser(){
		super(3, "Premium");
	}

	public void excute(){
		//ランクの表示
		System.out.println("RANK : " + super.getName(3));
		System.out.println("");
		System.out.println("0 : ログアウトする");
		System.out.println("1 : 商品を探す");
		System.out.println("2 : 商品を購入する");
		System.out.println("3 : 商品を売却する");
		System.out.println("4 : チャットして遊ぶ");

		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}

}

