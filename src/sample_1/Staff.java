package sample_1;

public class Staff {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cashier cash = new Cash();
		Cashier credit = new CreditCard();
		
		System.out.println("現金対応");
		cash.bill();
		cash.cashError();
		
		System.out.println("クレジット対応");
		credit.bill();
		credit.creditError();
		
		Product productManager = new ProductManager();
		productManager.productItems();
		productManager.productDeadline("2020/5/7");
		
	}
	

}
