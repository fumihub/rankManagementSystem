package view;


//機能ページの抽象クラス
public abstract class FunctionView {
	//フィールド
	private String pageName[] = new String[6];

	//コンストラクタ
	FunctionView(int num, String pageName){
		this.pageName[num] = pageName;
	}

	//ページの機能名の取得
	public String getName(int num) {
		return pageName[num];
	}

	public abstract void excute();
}
