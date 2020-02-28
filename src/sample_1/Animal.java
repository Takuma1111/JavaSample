package sample_1;

public abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//共通している要素
	public void sleep() {
		System.out.println("寝る");
	}
	//abstracは処理内容がまだ定義されていないメソッドである
	//インスタンス生成はすることができない
	//動物によって話し方や食べるものも違うので抽象メソッドとして宣言
	public abstract void speak();
	public abstract void eat();
}
