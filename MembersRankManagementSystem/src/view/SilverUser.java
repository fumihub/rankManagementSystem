package view;

import java.util.Scanner;

import presenter.ManagementSystem;

//シルバーランククラス
public class SilverUser extends MypageView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public SilverUser(String rank){
		super(rank);
	}

	public void excute(){
		//ランクの表示
		System.out.println("RANK : " + super.getName());
		System.out.println("");
		System.out.println("0 : ログアウトする");
		System.out.println("1 : 商品を探す");
		System.out.println("2 : 商品を購入する");

		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}

}

