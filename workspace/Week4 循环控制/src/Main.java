import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 第四周 循环控制
		// 4-1.1 for循环
		// 阶乘
		// n! = 1*2*3*4*...*n
		// 变量：
		// 显然读用户的输入需要一个int的n，然后计算的结果需要用一个变量保存，可以是int的factor，
		// 在计算中需要有一个变量不断地从1递增到n，那可以是int的i
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int i = 1;
//		int factor = 1;  // 表达累计的结果应该初始化为1
//		while (i <= n)
//		{
//			factor = factor * i;
//			i = i + 1;
//		}                         // 如果是20的阶乘，就超过了int的显示范围
//		for (i=1; i<=n; i=i+1)         // for循环像一个计数循环：设定一个计数器，初始化它，
//		{							   // 然后在计数器到达某值之前，重复执行循环体，而没执行，
//			factor = factor * i;	   // 一轮循环，计数器值以一定步进进行调整，比如加1或者
//		}							   // 减1.
//		System.out.println(factor);
		
		// for （初始化；条件；单步动作）{}
		// for 循环总是可以改造 while 循环
		// for 循环中的每一个表达式都是可以省略的
		// for (;条件;) == while (条件)
		
		// for (i=0;i<n;i=i+1)
		// 则循环的次数是n，而循环结束以后，i的值是n。循环的控制变量i，是选择从0开始还是从1开始
		// 还是从1开始，是判断i<n还是判断i<=n，对循环的次数，循环结束后变量的值都有影响。
		
		// Tips for loops
		// 如果有固定次数，用for
		// 如果必须执行一次，用do_while
		// 其他情况用while
		
		
		
		// 4-1.2 复合赋值
		// a = a + 6;  --->  a += 6;
		
		
		// 4-2.1 循环控制
		// 素数：只能被1和自己整除，不包括1.
		// 如何判断一个数字是不是素数：循环 ％2 break
		
		
		// break VS continue
		// break:跳出循环
		// continue:跳过循环这一轮剩下的语句进入下一轮
		
	}

}
