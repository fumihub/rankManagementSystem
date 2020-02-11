package view;


//機能ページの抽象クラス
public abstract class FunctionView {
	//フィールド
	private String pageName;

	//コンストラクタ
	FunctionView(String pageName){
		this.pageName = pageName;
	}

	//ページの機能名の取得
	public String getName() {
		return pageName;
	}

	public abstract void excute();
}
