package notebook;

import java.util.ArrayList;

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
		String[] a = new String[notes.size()];
		a = notes.toArray(a);
		return a;             
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义好范型容器来存储记事的内容之后，写一些简单代码进行测试
		NoteBook note = new NoteBook();
		note.add("first");
		note.add("second");
		System.out.println(note.getSize());
		System.out.println(note.getNote(1));

	}

}
