package sample_1;
//クレジット決済の詳細を記載
public class CreditCard implements Cashier{
	@Override
	public void bill() {
		System.out.println("クレジットカードで支払いお願いします。");
	}
	
	public void creditError() {
		System.out.println("クレジット決済の際にエラーが発生しました。");
	}
	
	public void cashError() {
		
	}
}
