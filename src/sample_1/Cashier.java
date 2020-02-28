package sample_1;

//レジインタフェースに会計メソッドを定義する

//interfaceはメソッド名、戻り値、引数のみを定義したもの
//interface名をしていることによりインタフェースに実装している全てのクラスを参照することができる	

//一つの記述で複数のクラスを対応させることができるのでクラス毎に同じ処理を書く必要がなくなり、保守性は増す
public interface Cashier {
	public void bill();
	public void creditError();
	public void cashError();
}

 