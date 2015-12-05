package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello Java!");
		
		// 让计算机可以读取输入内容
//		Scanner in = new Scanner(System.in);
//		System.out.println(in.nextLine());
		
		//做出回应，连接字符串
//		System.out.println("echo:" + in.nextLine());
		// 快捷键小技巧 ： shift + 方向键   效果： 选定代码的区域,便于删除或者注释
//		System.out.println("2+3="+5);
		
		// 那么如何能让计算机自己算出这个式子呢？
//		System.out.println("2+3="+2+3);   // 这个得到的结果将是 2+3=23
		
//		正确的写法应该是如下
//		System.out.println("2+3="+(2+3));
		
		// 但是再看下面这种情况，其实原因就是计算中间存在的优先级问题
//		System.out.println(2+3+"=2+3="+(2+3));
		
		// 写一个简单的应声虫程序，读入用户输入的文字，在输出的时候在前面加上“ECHO:”这个字符串
//		System.out.println("Hello");
//		Scanner putIn = new Scanner(System.in);
//		System.out.println("ECHO:" + putIn.nextLine());
		
		
		
		// 1.2.2 变量
		
//		int price = 0;
//		Scanner in = new Scanner(System.in);
//		price = in.nextInt();
//		System.out.println("100 - " + price + " = " + (100 - price));
		
		/*       变量定义
		 * 变量定义的一般形式就是：
		 *  <类型名称> <变量名称>；
		 *  int price; 
		 *  int amount;
		 *  int price, amount;
		 * 
		 *  变量需要一个名字，变量的名字是一种“标识符”，意思是用它来识别这个与那个之间不同的名字。
		 *  
		 *  Java 一共有55个保留字
		 *  Java 是强类型语言，所有的变量都需要定义，即具有确定的数据类型。没有定义的变量是不能被使用的。
		 */
		
		
		
		// 1-2.3 赋值
		// 不变的变量叫做常量
//		final int amount = 100;
//		Scanner in  = new Scanner(System.in);
//		int price = 0;
//		price = in.nextInt();
//		System.out.println(amount + "-" + price + "=" + (amount - price));
		
		// 现在我们希望其中的 变量 amount 不是固定的，是可以改动的，那么该如何操作呢？
//		int amount = 0, price = 0;
//		Scanner in = new Scanner(System.in);
//		System.out.println("收入");
//		amount = in.nextInt();
//		System.out.println("支出");
//		price = in.nextInt();
//		System.out.println("剩余");
//		System.out.println(amount + "-" + price + "=" + (amount - price));
		
		
		
		// 1-2.4 浮点数
//		int foot;
//		int inch;
//		Scanner in = new Scanner(System.in);
//		foot = in.nextInt();
//		inch = in.nextInt();
////		System.out.println((foot + inch / 12)*0.3048);   这个方法算出来的身高是不正确的，因为 inch / 12 得出的结果是求整，需要为12.0
////		System.out.println((foot + inch / 12.0) * 0.3048);
//		// 作业
//		double meter = (foot + inch / 12.0) * 0.3048;
//		System.out.println(meter);
		
		// 因为两个整数运算的结果只能是整数，10和10.0是完全不同的数，10.0是浮点数。
		// 浮点数间的计算是有误差的:  System.out.println(1.2 - 1.1);
		
		
		// 1-2.5 优先级
		
		// 1-2.6 类型转换
//		double a = 1.29;
//		System.out.println(a);
//		System.out.println((int)a);
//		System.out.println((int)(a + 1.3));
		
		// WEEK1 作业
//		int input = 0, output = 0;
//		Scanner in = new Scanner(System.in);
//		input = in.nextInt();
//		output = (int)((input - 32) * (5 / 9.0));
//		System.out.println(output);
	}
// 任何程序都可以理解为有一些输入，将这些输入的数据记录下来，加以计算，然后输出的过程
	
}
