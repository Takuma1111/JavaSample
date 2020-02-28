package sample_1;
//銀金会計の処理を記載
public class Cash implements Cashier{
	@Override
	public void bill() {
		System.out.println("現金で支払いしてください。");
		System.out.println("支払い待ち・・・");
	}
	
	@Override
	public void cashError() {
		System.out.println("現金支払いでエラーが発生しました。");
	}
	
	public void creditError() {
		
	}
}
