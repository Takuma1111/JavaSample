package sample_1;

public class TestClass {
	String name = "Takuma";
	String TestMetod() {
		return "Engineer";
	}
	
	String Birthday(Integer age) {
		return name + "さんは" + age + "歳です";
	}
	
	String Job(Integer id) {
		switch(id) {
			case 0:
				return "学生です。";
			case 1:
				return "社会人です。";
			default:
				return "フリーターです。";
		}
	}
	
}
