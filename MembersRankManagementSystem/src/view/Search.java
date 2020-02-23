package view;

import java.util.Scanner;

import presenter.ManagementSystem;

public class Search extends FunctionView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public Search(){
		super(1, "商品の検索");
	}

	@Override
	//画面表示
	public void excute() {
		System.out.println(super.getName(1) + "画面です。");

		System.out.println("");
		System.out.println("0 : ログアウトする");


		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}
}
