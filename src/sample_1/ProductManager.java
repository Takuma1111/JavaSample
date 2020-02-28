package sample_1;

public class ProductManager implements Product {
	@Override
	public void productItems() {
		System.out.println("残りの在庫数はいくらですか？");
	}
	
	@Override
	public void productDeadline(String line) {
		System.out.println("在庫の消費期限は" + line + "です" );
	}

}
