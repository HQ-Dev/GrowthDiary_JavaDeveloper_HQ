package notebook;

import java.util.ArrayList;

class Value {
	private int i;
	public void set(int i) { this.i = i; }
	public int get() { return i;}
}

public class NoteBook {
	// 定义一个范型容器类来存储相应的数据
	private ArrayList<String> notes = new ArrayList<String>();
	
// 定义了记事本这个类之后，我们开始定义一些它应该具有的功能接口（interface）
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(int index, String s) {
		notes.add(1, s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void remove(int index) {    // 关于删除方法的返回值用void不全面，为了知道是否删除成功，返回布尔值比较好
		notes.remove(index);           // ArrayList中的方法会自己返回被删除的字符串，所以返回值改为void
	}
	
	public String[] list() {   // 让其返回一个数组，而得到数组的用户可以根据需要对数组进行他所希望的操作
//		return new String[10];	
		String[] a = new String[notes.size()];  // 这个数组a中存放的是什么，在main中测试一下
		a = notes.toArray(a);
		return a;             
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		for ( String s : a )
		{
			System.out.println(s);   // 说明for-each循环对 ArrayList类也是可以使用的。
		}
		
//		Value[] a = new Value[10];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for ( Value v : a) {
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for ( Value v : a) {
//			System.out.println(v.get());
//		}
		
//		int[] b = new int[10];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = i;
//		}
//		for (int k : b) {      // 3.2.2中讲到的 for-each 循环
//			System.out.print(k);
//		}
//		for (int k : b) {
//			k++;        这个k在整型中的for-each中代表了其中每个元素的复制品，但是如若相同情况在String[]中则会有不同的表现。
//		} 再创建一个 Value类来实验
//		System.out.println(b[0]);  // 这个可以打印出0，因为所有数组中的元素都自动初始化为0
//		String[] a = new String[10];
//		System.out.println(a[0]);   // 这个打印出来是个null，其实这个数组中的每一个元素都是String的管理者，但是没有初始化，所以它没有管理什么东西，所以打印出来的是null
//		for(int i = 0 ; i< a.length; i++)
//		{
//			a[i] = "" + i;
//		}
//		System.out.println(a.length);//对象数组中的每个元素都是对象的管理者而非对象本身。
		
//		// 定义好范型容器来存储记事的内容之后，写一些简单代码进行测试
//		NoteBook note = new NoteBook();
//		note.add("first");
//		note.add("second");
//		System.out.println(note.getSize());
//		System.out.println(note.getNote(1));

	}

}
