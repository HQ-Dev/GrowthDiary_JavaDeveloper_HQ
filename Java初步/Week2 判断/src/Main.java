import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 初始化
//		Scanner in = new Scanner(System.in);
//// 读入投币金额
//		System.out.print("请投币");
//		int amount = in.nextInt();
//// 打印车票
//		System.out.println("**************");
//		System.out.println("Java城际铁路专线");
//		System.out.println("*  无指定座位票  *");
//		System.out.println("  票价：10元  ");
//		System.out.println("**************");
//// 计算并打印找零
//		System.out.println("找零：" + (amount - 10));
		
		
		
		// 2-1.2 关系运算
		// 优先级
		// 所有的关系运算符的优先级比算数运算的低，但是比赋值运算的高。
		// 比较浮点数和整数的大小，最好如下面所示:
//		int a = 1;
//		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
//		System.out.println(Math.abs(a-b) < 1e-6);    // （a-b的绝对值是否小于一个很小的数）
		
		
		
		// 2—2.1 做判断   2-2.2 判断语句
		// 如果投入的钱是五元，它还是会出票，所以我们要让程序做判断，如果投入的钱不够票面金额，则不能出票。
//		Scanner in = new Scanner(System.in);
//		System.out.println("请投币：");
//		int amount  = in.nextInt();
//		if (amount >= 10) {
//			System.out.println("**************");
//			System.out.println("Java城际铁路专线");
//			System.out.println("*  无指定座位票  *");
//			System.out.println("  票价：10元  ");
//			System.out.println("**************");
//// 计算并打印找零
//			System.out.println("找零：" + (amount - 10));
//		} else {
//			System.out.println("您投入的钱不够支付票价，您还需要投入：" + (10 - amount) + "元");
//		}
		
		
		// 2-2.3 嵌套和级联的判断
		// 如何可以判断3个数中哪个数字最大或者最小
		// 这里讲的嵌套就是只if里面还有if
		// 在Java中else总是和最近的那个if匹配，除非加上大括号。
		// 下面示例什么叫做级联的if-else语句
//		int x = 0, f = 0;
//		if (x < 0) {
//			f = -1;
//		} else if (x == 0) {
//			f = 0;
//		} else {
//			f = 2 * x;
//		}
//		System.out.println(f);      // 这种叫做单一出口，以后要改变f的输出的话，只在一条语句中进行相应的修改就可以了。
		
		
		// 2-2.4 判断语句常见问题
		// 常见错误：是否等于应该使用用两个等号 == 判断 而不是一个＝
		// 不过还好JAVA编译器会自动给你错误提示
		// 代码有大致有三种风格，分隔开对于使用快速注释比较有效率，不会误伤。
		
		
		// 2-2.5 多路分支
		// 对级联if-else语句的优化
		// 可以使用 switch-case 语句，  下面有例子
//		Scanner in = new Scanner(System.in);
//		int type = in.nextInt();
//		switch (type) {
//		case 1:
//			System.out.println("123");
//			break;
//		case 2:
//			System.out.println("456");
//			break;
//		case 3:
//			System.out.println("789");
//			break;
//		case 4:
//			System.out.println("10");
//			break;
//		default:
//			System.out.println("dsdsd");
//		}
		
		// 要特别注意一点，在 switch-case语句中 break 很重要，要用好它！
		
	}

}
