package view;

import java.util.Scanner;

import presenter.LoginPresenter;

public class Login extends FunctionView{
	//フィールド
	private Scanner scanner = new Scanner(System.in);

	//コンストラクタ
	public Login(){
		super(6, "ログイン");
	}

	@Override
	//画面表示
	public void excute() {
		System.out.println(super.getName(6) + "画面です。");

		System.out.println("");
		System.out.println("");

		System.out.println("ログインIDを入力してください。");
		LoginPresenter.id = scanner.nextLine();
		System.out.println("パスワードを入力してください。");
		LoginPresenter.pass = scanner.nextLine();
	}
}
