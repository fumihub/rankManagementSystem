package view;

import java.util.Scanner;

import presenter.ManagementSystem;

//ノーマルランククラス
public class NormalUser extends MypageView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public NormalUser(){
		super(0, "Normal");
	}

	public void excute(){
		//ランクの表示
		System.out.println("RANK : " + super.getName(0));
		System.out.println("");
		System.out.println("0 : ログアウトする");
		System.out.println("1 : 商品を探す");

		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}

}

