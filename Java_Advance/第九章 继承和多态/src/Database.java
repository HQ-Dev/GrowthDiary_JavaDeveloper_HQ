/*
 * 这个存储cd或者dvd信息的数据库程序是有缺陷的。这个系统创建了3个类，一个数据库类，一个是CD类，一个是DVD类
 * 首先，CD&DVD这两个类非常的相似，以及在数据库类种也存在很多的代码复制。
 * 出现大量代码复制，是代码质量不良的一种表现。（将来进行代码的维护是不容易的，并且不具有可扩展性）
 * 这个时候可以引入一个父类，是CD类和DVD类的父类，用来减少这两个类的重复代码。(进行代码修改)
 * （不用的代码皆已经注释）
 */

import java.util.ArrayList;

public class Database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItems = new ArrayList<Item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}	
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
	public void add(Item item) {
		listItems.add(item);
	}
	
	public void list() {
//		for (CD cd : listCD) {
//			cd.print();
//		}
//		for (DVD dvd : listDVD) {
//			dvd.print();
//		}
		for ( Item item : listItems) {
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("出发", "李健", "幽远清亮", 10, 60, true));
		db.add(new DVD("烈日雄心", "大尺度的电影", 120, true, "不是邓超"));
		db.list();
		
	}

}
