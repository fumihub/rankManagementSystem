package view;

import java.util.Scanner;

import presenter.ManagementSystem;

public class Chat extends FunctionView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public Chat(){
		super("チャット");
	}

	@Override
	//画面表示
	public void excute() {
		System.out.println(super.getName() + "画面です。");

		System.out.println("");
		System.out.println("0 : ログアウトする");


		System.out.println("番号をお選びください。");
		ManagementSystem.selection = scanner.nextInt();

	}
}
