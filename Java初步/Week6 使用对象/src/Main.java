import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 第六周
		// 6-1.1 字符类型
		/*
		 * 单个的字符是一种特殊的类型：char
		 *   用单引号表示字符字面量：‘a’，‘1’
		 *   Java使用Unicode来表示字符，可以表达包括汉子在内的多种语言
		 * 
		 * 
		 */
//		Scanner in = new Scanner(System.in);
//		char c = '汉';
//		System.out.println(c);
//		
//		c++;    // 如果c是‘A’ , 则打印c会是B
//		System.out.println(c);
//				
//		int i = 'Z' - 'A';
//		System.out.println(i);
//		
//		char b = 'B';
//		char d = 'D';
//		System.out.println(b-d);    // 打印出来的是－2，因为b是第二个字母，d是第四个字母，两个字母之间的距离
//		
//		// 在Unicode中，大写字母和小写字母是按顺序分开排列的，我们应该如何讲大写字母转换成小写字母呢？
//		char e = 'A';
//		char f = (char)(e + 'a'-'A');
//		System.out.println(f);
		
		
		// 6-1.2  逃逸字符
		/*
		 * 用来表达无法印出来的控制字符或者特殊字符，它由一个反斜杠“\”开头，
		 * 后面跟上另一个字符，这两个字符合起来组成一个字符
		 * 
		 *            常见的逃逸字符
		 *        \b  回退一格（在eclipse下不会由反应）
		 *        \“  双引号
		 *        \t  到下一个表格位  （中间空8格）
		 *        \n  换行
		 *        \\  反斜杠本身
		 *        \r  回车
		 */
		
		
		// 6-1.3  包裹类型
		/*
		 * 前面其实我们已经讲解介绍了四种类型：
		 * boolean   char   int   double
		 * 
		 * 他们都有对应的包裹类型
		 * Boolean   Character   Integer   Double
		 * 可有用包裹类型来定义变量，那么它有那些特别的地方呢？
		 * 
		 * 其实我们可以通过包裹类型的特性得到很多我们或许需要的信息
		 * Integer i = 10;
		 * System.out.print(Integer.MAX_VALUE);
		 * 在java中 int 类型需要四个字节即32个bit来存储
		 * 
		 * 前面将讲到的如何将大写字母转变位小写字母，使用Character.toLower('I');
		 * 更加的简单。
		 * 
		 */
//		Scanner in = new Scanner(System.in);
//		Integer a = 4;
//		Integer b = a;                  //由这个试验可以知道，包裹类型适合基础类型一样
//		b = 5;							// 的数据拥有者，非数组类型一样的管理者。
//		System.out.println(b);			// 待检验
//		System.out.println(a);
		
		
		// 6-2.1  字符串变量
		/*
		 *           字符串变量
		 *     String s;         String 是一个类，s要大写，是系统内部中的一格类
		 *     String是一格类，String的变量是对象的管理者而非所有者
		 *       就象数组变量是数组的管理者而非所有者一样
		 *       
		 *            new = 创建
		 *      String s = new String("a string");
		 *      意思是：创建了一个String的对象
		 *      用"a string" 初始化这个对象
		 *      创建管理这个对象的变量s  （字符串变量里面并没有放字符串本身，它是字符串对象的管理者）
		 *      让s管理这个对象
		 *      
		 *      也可以直接初始化字符串变量
		 *      String s = "Hello";
		 *      编译器帮你创建一个String类的对象交给s来管理
		 *      
		 *            字符串连结
		 *      如果在＋的一遍是字符串另一边不是字符串，会将另一边表达位字符串然后做连结
		 *      "I'm" + 18 ---> "I'm 18"
		 *      1+2+"age" ---> "3age";
		 *      "age"+1+2 ---> "age12";
		 *      
		 *            如何可以输入字符串
		 *      in.next(); 会读一个单词    分界的标志是空格  \  回车
		 *      in.nextLine; 会将一整行读入   
		 *      
		 *        比较两个写入的字符串    （注意String对象是管理者而非拥有者，所以会下面需要注意）
		 *        if (input == "bye") { }         比较是否同一个
		 *        if (input.equals("bye")) {}     这个比较的是内容是否相同
		 * 
		 */
//		Scanner in = new Scanner(System.in);
//		String s;
//		s = in.next();
//		System.out.println(s);
//		System.out.println(s == "bye");
//		System.out.println(s.equals("bye"));
//		String a = "hello";
//		a = "bye";
//		System.out.println(a);
		
		
		// 6-2.2 字符串操作
		/*
		 * 字符串是对象，对它的所有操作都是通过"."这个运算符进行的。
		 *  字符串.操作
		 * 它表示对.左边的这个字符串做右边的那个操作
		 * 这里的字符串可以是变量也可以是常量
		 * 
		 *  			Strings大小的比较
		 *  两个字符串可以比较大小：
		 *  			s1.compareTo(s2)     （即根据UINICODE编码来判断大小）
		 *    如果s1比s2小，那么结果为负；如果s1==s2，那么结果为0；如果s1>s2，结果为正。
		 *    compareToIgnoreCase可以不区分大小写地来比较大小
		 * 
		 */
//		Scanner in = new Scanner(System.in);
//		String s1 = "dsx";
//		String s2 = "cwy";
//		System.out.println(s1.compareTo(s2));  // 1 所以s1大
		
		// 如果想要访问一个字符串中地单个字符，可以使用s.charAt(index)
		// 但是不能用 for-each 循环来遍历字符串
//		Scanner in  = new Scanner(System.in);
//		String s  = "asd";
//		System.out.println(s.charAt(2));
//		for (int i = 0; i<s.length(); i++)
//		{
//			System.out.println(s.charAt(i));
//		}
		
		/*
		 *        得到子串
		 *   s.substring(n)
		 *      得到从n号位置到末尾的全部内容
		 *   s.substring(b,e)
		 *      得到从b号位到e号之前的内容 （不包括e位的内容
		 *      
		 *      
		 *          寻找字符
		 *    s.indexOf(c);    得到c字符所在位置，－1表示不存在
		 *    s.lastIndexOf(c);    从右边开始寻找
		 *    
		 *    s.indexOf(c,n);        从n号位置开始寻找c字符
		 *    s.lastIndexOf(c,n);    从右边开始寻找
		 *    
		 *    s.indexOf(t);      找到字符串t所在位置
		 *           
		 */
		Scanner in = new Scanner(System.in);
		String s = "12345673你好";
		int loc = s.indexOf('3');       // 寻找字符串中的3，如果由两个3，要这样才能找到第二个
		System.out.println(s.indexOf('3', loc + 1));
		
		/*
		 * 			其他string操作
		 *  s.startsWith(t)     询问字符串是否以t开始
		 *  s.endsWith(t)
		 *  s.trim()            把字符串两端的空格删除
		 *  s.replace(c1,c2)	把字符串中所有的c1都换成c2
		 *  s.toLowerCase()     所有字符调整为大写或者小写
		 *  s.toUpperCase()
		 * 
		 * 
		 * 在java中所有的字符串都是不可变的，对它们的操作的结果都是制造新的字符串出来
		 * 
		 * 
		 * 			在switch-case中使用字符串
		 *  switch(s){
		 *     case "this":...break;
		 *     case "that":...break;
		 *  }
		 * 
		 */
		
		
		// 6-2.3 Math类
		// abs    计算绝对值
		// pow    可以算数字的幂次
		// random
		// round   可以做一些四舍五入
		System.out.println(Math.abs(-12));
		System.out.println(Math.round(10.345));
		System.out.println(Math.random());   // 0到1之间的数
		System.out.println(Math.pow(2, 3));  // 计算2的3次方
		
		System.out.println(Character.);
		
		
		//
	}

}
