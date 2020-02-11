
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Javadbへのコネクション関係の処理を抽象化。エラーログの定義
 * @author heyhe
 *
 */
public class JavaConnection {

	//フィールド
	private static JavaConnection instance = new JavaConnection();
	private Connection con = null;

	//コンストラクタ
	/**
	 * DB接続
	 */
	private JavaConnection() {
		try {
			System.out.println("PostgresSQLに接続中...");
			// PostgresSQLに接続
			//"jdbc:SQLの種類：URL/接続DB","ID","Pass"
			con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/users",
					"postgres",
					"24D2316");
			System.out.println("PostgresSQLに接続できました。");
		} catch (SQLException e1) {//接続失敗時の例外処理
			System.out.println("PostgresSQLに接続できませんでした。");
		}
	}

	/**
	 * インスタンスのゲッター（Singletonパターン）
	 * @return 唯一のインスタンス
	 */
	public static JavaConnection getInstance() {
		return instance;
	}

	/**
	 * connectionの取得(いらないかも？)
	 * @return DBコネクション
	 */
	public Connection getMySQLConnection() {
		return con;
	}

	/**
	 * Statementの取得
	 * @return statement
	 * @throws SQLException
	 */
	protected Statement getStatement() throws SQLException {
		return con.createStatement();
	}

}
