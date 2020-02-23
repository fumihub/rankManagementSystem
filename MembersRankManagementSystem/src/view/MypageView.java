package view;


//抽象クラス（マイページ）
public abstract class MypageView {
	//フィールド
	private String rank[] = new String[5];

	//引数つきコンストラクタ
	MypageView(int num, String rank){
		this.rank[num] = rank;
	}

	//ランクの取得
	public String getName(int num) {
		return rank[num];
	}

	//画面表示（抽象メソッド）
	public abstract void excute();
}
