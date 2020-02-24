package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import presenter.ManagementSystem;

//TODO 登録日時のDB登録
public class UserModel {

	//フィールド
	private static UserModel userModelInstance = new UserModel();
	private Statement dbstatement;

	//constractor
	private UserModel() {
		try {
			dbstatement = JavaConnection.getInstance().getStatement();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("ステートメント取得失敗");
		}
	};

	//singleton
	public static UserModel getInstance() {
		return userModelInstance;
	}

	/**
	 *
	 */
	public boolean authMember(String id, String pass) {
		try {
			if(checkAuth(id, pass).next() == false) {
				return false;
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return true;

	}
	/**
	 * DBに問い合わせ、rankを取得する。
	 * @param id
	 * @param pass
	 * @return Data
	 * @throws SQLException
	 */
	public void getUserClass(String id, String pass) {
		//DBからデータオブジェクトを受け取る。
		ResultSet resultData = getUserClassData(id, pass);
		//次のデータがなければ
		try {
			while (resultData.next()) {
				ManagementSystem.rank = resultData.getString("rank");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private ResultSet checkAuth(String id, String pass) {
		//sql文 = selec * from account(テーブル名) where id(カラム名) and pass(カラム名);
		String sql = "SELECT "
				+ "*"
				+ " FROM "
				+ "account "
				+ "WHERE "
				+ "id = '" + id
				+ "' AND "
				+ "pass = '" + pass
				+ "';";
		try {
			ResultSet result = dbstatement.executeQuery(sql);//ResultSet型を返す
			//System.out.println("クラスデータ取得成功");
			return result;
		} catch (SQLException e) {
			//System.out.println("クラスデータ取得失敗");
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Userデータを取得する
	 * SQLでDBに問い合わせ
	 * @param id
	 * @param pass
	 * @return SetResult data
	 */
	private ResultSet getUserClassData(String id, String pass) {
		//statementインターフェースを利用してDB操作をする
		//sql文 = selec rank(カラム名) from account(テーブル名) where id(カラム名) and pass(カラム名);
		String sql = "SELECT "
				+ "rank "
				+ " FROM "
				+ "account "
				+ "WHERE "
				+ "id = '" + id
				+ "' AND "
				+ "pass = '" + pass
				+ "';";
		try {
			ResultSet result = dbstatement.executeQuery(sql);//ResultSet型を返す
			//System.out.println("クラスデータ取得成功");
			return result;
		} catch (SQLException e) {
			//System.out.println("クラスデータ取得失敗");
			e.printStackTrace();
			return null;
		}
	};
}
