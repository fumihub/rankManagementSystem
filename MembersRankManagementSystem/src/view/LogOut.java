package view;

import java.util.Scanner;

import presenter.ManagementSystem;

public class LogOut extends FunctionView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public LogOut(){
		super(0, "ログアウト");
	}

	@Override
	//画面表示
	public void excute() {
		System.out.println(super.getName(0) + "画面です。");

		System.out.println("");
		System.out.println("6 : ログイン画面に戻る");
		System.out.println("7 : システムを終了する");


		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}
}
