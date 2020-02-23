package view;

import java.util.Scanner;

import presenter.ManagementSystem;

public class Purchase extends FunctionView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public Purchase(){
		super(2, "商品の購入");
	}

	@Override
	//画面表示
	public void excute() {
		System.out.println(super.getName(2) + "画面です。");

		System.out.println("");
		System.out.println("0 : ログアウトする");


		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}
}
