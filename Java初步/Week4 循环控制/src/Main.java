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
		
		
		// 4-2.2 多重循环
		// 如何写出程序输出100以内的素数
//		Scanner in = new Scanner(System.in);
//		for (int n = 2; n < 2000; n++) 
//		{
//			int isPrime = 1;
//			for (int i = 2; i < n; i++)
//			{
//				if (n % i == 0)
//				{
//					isPrime = 0;
//					break;
//				}
//			}
//			if (isPrime == 1)
//			{
//				System.out.print(n+" ");
//			}
//		}
		
		// 那么如何写程序写出前50个素数呢？
		// 很简单，我们需要一个变量来存储素数的数量，当达到50的时候就退出，循环，循环我们
		// 可以使用while，这里也可以不使用，我们使用一个2000次的循环，达到要求退出。
		// 对上面的代码做一点点小的调整
//		Scanner in = new Scanner(System.in);
//		int count = 0;
//		for (int n = 2; n < 2000; n++)
//		{
//			int isPrime = 1;                  // isPrime的作用是为了表明它是不是素数
//			for (int i = 2;i < n; i++)        // 1表示是素数，0表示不是
//			{
//				if (n % i == 0) 
//				{
//					isPrime = 0;
//					break;
//				}
//			}
//			if (isPrime == 1)
//			{
//				System.out.print(n + " ");   // 输出素数
//				count += 1;
//			}
//			if (count == 50)
//			{
//				break;
//			}
//		}
		
		//  凑硬币
		// 如何使用1角、2角和5角的硬币凑出10元一下的金额呢？
		// 这类问题特别适合计算机来解决，一般会使用枚举或者说穷举的方式来解决
		// 示例代码如下：
//		Scanner in = new Scanner(System.in);
//		int amount = in.nextInt();
//		for (int one = 0; one <= amount; one++)
//		{
//			for (int five = 0; five <= amount/5; five++)
//			{
//				for (int ten = 0; ten <= amount/10; ten++)
//				{
//					for (int twenty = 0; twenty <= amount/20; twenty++)
//					{
//						if (one+five*5+ten*10+twenty*20 == amount)
//						{
//							System.out.println(one + "张1元"+five +"张5元"+ten+"张10元"+twenty+"张20元");
//						}
//		            }
//				}
//			}
//		}
		
		// 比如我们不需要这么多的结果（运行程序会有很多的结果），我们希望达到一定条件的结果出现
		// 就可以跳出循环，其中 break 只能跳出那一层的循环。哪如何跳出最外层的循环呢？
		// 可以给最外层的循环取一个名字！
//		Scanner in = new Scanner(System.in);
//		int amount = in.nextInt();
//		OUT:
//		for (int one = 0; one <= amount; one++)
//		{
//			for (int five = 0; five <= amount/5; five++)
//			{
//				for (int ten = 0; ten <= amount/10; ten++)
//				{
//					for (int twenty = 0; twenty <= amount/20; twenty++)
//					{
//						if (one+five*5+ten*10+twenty*20 == amount)
//						{
//							System.out.println(one + "张1元"+five +"张5元"+ten+"张10元"+twenty+"张20元");
//							break OUT;
//						}
//					}
//				}
//			}
//		}
		// 在循环钱可以放一个标号来标识循环： label:
		// 带标号的break和continue对那个循环其作用（即一个循环取好标号后，可以用break&continue来指定下次用哪个循环）
		
		
		// 4-2.3 逻辑类型
		// 修缮上面的素数判定输出代码段
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		boolean isPrime = true;
//		for (int i = 2; i<n; i++)
//		{
//			if (n % i == 0)
//			{
//				isPrime = false;
//				break;
//			}
//		}
//		if (isPrime)
//		{
//			System.out.println(n+"是素数");
//		}
//		else
//		{
//			System.out.println(n+"不是素数");
//		}
		
		// 逻辑运算
		// !－－逻辑非    &&－－逻辑与    ||--逻辑或
		
		// TRY
		// 如果要表达数学中的区间，如：x属于(4，6)或者 x属于[4，6]
		// 应该如何写Java的表达式？
		// x > 4 && x <6
		
		// 逻辑运算符也是有优先级的
		// !>&&>||
		
		
		
		// 4－3.1 求和
		// 例如如何求 f(n) = 1 + 1/2 + 1/3 + 1/4 + ...+ 1/n;
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		double sum = 0.0;
//		for (int i = 1; i <= n;i++) 
//		{
//			sum += 1.0/i;
//		}
////		System.out.println(sum);       // 如果我们希望结果输出是小数点后两位数,如下：
//		System.out.printf("%.2f", sum);        //这种方法输出，会帮我们做四舍五入运算
		
		// 接下来，将题目改动一下
		// 求 f(n) = 1 - 1/2 + 1/3 - 1/4 + ... + 1/n
		// 第一个思路是，我们有一个变量来表达符号，一轮是负号，一轮是正号
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		double sum = 0.0;
//		int sign = 1;
//		for (int i=1; i<n;i++)
//		{
//			sum += sign*1.0/i;
//			sign = -sign;       // 非常重要的一点，可以将这条语句放到上面去！如下：
//		}                       // for(int i=1; i<n; i++, sign = -sign) { }
//		System.out.println(sum);
		
		// 另一个思路，就是 if-else判定负号位置的奇偶来决定正负号
		
		
		
		// 4-3.2 最大公约数
		// 输入两个数a和b，输出它们的最大公约数
		// 输入： 12 18
		// 输出：6
		// 第一个办法，就是循环一定范围内的数字，去整除12和18，取最大能整除的那个数字
		// 最大公约数英文缩写是 gcd
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int gcd = 1;
//		for (int i=1; i<=a && i <= b ;i++) 
//		{
//			if (a % i == 0 && b % i == 0)
//			{
//				gcd = i;
//			}
//		}
//		System.out.println(gcd);
		
		// 上面的方法使用了枚举，下面我们使用更聪明的碾转相除法（又叫做欧几里德法）进行解决
		// 1.如果在a&b两个数字中，b是0，则a就是最大公约数
		// 2.否则，计算a%b,计算后，让a＝b，b = 余数
		// 3.再次重复上面的步骤，如果a%b＝0，则现在b就是最大公约数，
		// 但是，根据碾相除法，b要赋予a，而b要等于0，所以最大公约数则是a。如果不能整除，重复
		// 看文字也许不能理解，找两个合适的数，进行演算，就很容易可以明白了。
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int gcd = 1;
//		while (b != 0)
//		{
//			int r = a % b;
//			a = b;
//			b = r;
//		}
//		System.out.println(a);  // 但是经过计算之后，原来的a,b都丢失了，所以我们应该在
//								// 开头添加代码来记录a和b
//								// int oa = a; int ob = b; (oa就是original a意思)
		
		
		// 期中练习
//		int i = 6;
//		do
//		{
//			System.out.println(i--);
//		} while(false);        // 永不运行
		
		int j = 4;
		for (int i=j;i<=j*2;i++)
		{
			switch(i/j)
			{
			case 0:
			case 1:System.out.println("#");break;
			case 2:System.out.println("*");
			}
		}
		
		
		
		
	}

}












