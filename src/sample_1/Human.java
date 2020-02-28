package sample_1;

public class Human extends Animal{
	String name = "Hello";
	public Human(String name){
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println("初めまして、私の名前は"+ name + "です");
	}
	
	@Override
	public void eat() {
		System.out.println("もぐもぐ");
	}
}
