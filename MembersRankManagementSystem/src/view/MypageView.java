package view;


//抽象クラス（マイページ）
public abstract class MypageView {
	//フィールド
	private String rank;

	//引数つきコンストラクタ
	MypageView(String rank){
		this.rank = rank;
	}

	//ランクの取得
	public String getName() {
		return rank;
	}

	//画面表示（抽象メソッド）
	abstract void excute();
}
