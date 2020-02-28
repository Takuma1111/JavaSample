package sample_1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human tarou = new Human("太郎");
		Dog pochi = new Dog("ポチ");
		
		System.out.println("太郎の処理");
		tarou.sleep();
		tarou.speak();
		tarou.eat();
		
		System.out.println("ポチの処理");
		pochi.sleep();
		pochi.speak();
		pochi.eat();
		

		//リストの作成
        List<Integer> foo = new ArrayList<Integer>();
        foo.add(10);
        foo.add(20);
        foo.add(30);
        System.out.println("fooの出力：" + foo);
        
        Integer count = 0;
        // ArrayListからLinkedListへの変換
        //LinkedListは要素を追加したり削除したりする場合にArrayListと比べて高速に動作する
        //しかし要素を検索する時に先頭から検索するのでArrayListと比べて遅くなるデメリットがある
        LinkedList<Integer> ll = new LinkedList<Integer>(foo);
        for(Integer i : ll) {
        	count += 1;
        	System.out.println("Count:" + count);
            System.out.println(i);
            System.out.println("llの全て：" + ll);
        }
        //リストかする必要性、ArrayLListからLinkedListへの変換の必要性
        
        List<String> item = new ArrayList<String>();
        item.add("PC");
        item.add("Wifi");
        item.add("power");
        System.out.println("Item出力結果");
        LinkedList<String> ss = new LinkedList<String>(item);
        for(int i = 0; i < item.size(); i++) {
        	System.out.println(i + " : " + ss.get(i));
        }
	}
}


 