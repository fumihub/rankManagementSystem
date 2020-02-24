package presenter;

import model.UserModel;
import view.Login;
import view.LoginError;

public class LoginPresenter {
	//フィールド
	private static LoginPresenter loginPresenterInstance = new LoginPresenter();
	private static UserModel model = UserModel.getInstance();
	private static Login login = new Login();
	private static LoginError loginError = new LoginError();
	public static String id;
	public static String pass;

	//シングルトン
	public static LoginPresenter getInstance() {
		return loginPresenterInstance;
	}

	public static void login() {
		//ログイン画面表示
		login.excute();

		//ログインが成功したら
		if( model.authMember(id, pass)) {
			model.getUserClass(id, pass);
		}
		else {
			//クリアスクリーン
			ManagementSystem.clrscr();
			//ログインエラー画面を表示
			loginError.excute();
			//ログイン画面に戻る
			if (ManagementSystem.selection == 6) {
				//クリアスクリーン
				ManagementSystem.clrscr();
				//再起
				login();
			}
			//システムを終了する
			else if (ManagementSystem.selection == 7) {
				System.exit(0);
			}
		}
	}
}