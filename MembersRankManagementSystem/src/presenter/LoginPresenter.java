package presenter;

import view.Login;

public class LoginPresenter {
	//フィールド
	private static LoginPresenter loginPresenterInstance = new LoginPresenter();
	private static Login login = new Login();
	public static String id;
	public static String pass;

	//シングルトン
	public static LoginPresenter getInstance() {
		return loginPresenterInstance;
	}

	public static void login() {
		//ログイン画面表示
		login.excute();

	}
}