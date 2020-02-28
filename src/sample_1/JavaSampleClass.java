package sample_1;

public class JavaSampleClass {
	public static void main(String[] args) {
		TestClass cl = new TestClass();
		String str1 = cl.name;
		String str2 = cl.TestMetod();
		System.out.println(str1 + str2);
		
		String str3 = cl.Birthday(21);
		System.out.println(str3);
		
		String str4 = cl.Job(4);
		System.out.println(str4);
	}
}
