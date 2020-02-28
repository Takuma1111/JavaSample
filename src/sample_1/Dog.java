package sample_1;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println("私の名前は"+ name + "だよ！");
	}
	
	@Override
	public void eat() {
		System.out.println("ガブガブ");
	}
}
