import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3-1.1 循环
		// 完成一个无限循环的买票系统
//		Scanner in = new Scanner(System.in);
//		// 定义一个机器余额
//		int balance = 0;
//		while (true)       // 注意这个写法，是无限循环
//		{
//			System.out.println("请投币：");
//			int amount = in.nextInt();
//			balance = balance + amount;
//			if (balance >= 10)
//			{
//				System.out.println("******************");
//				System.out.println("**Java城际铁路专线**");
//				System.out.println("**   无指定座票   **");
//				System.out.println("**    票价十元    **");
//				System.out.println("******************");
//				// 计算找零
//				System.out.print("找零：" + (balance - 10) + "元\n");
//				balance = 0;
//			} 
//			else
//			{
//				System.out.println("您还需要投币：" + (10 - balance) + "元");
//			}

		
		
		// 3—1.2 数数字
		// 程序要读入一个整数，然后输出这个整数的位数
		// 例如输入123，则输出3；输入4567，则输出4；
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		int count = 0;
//		while (number > 0)
//		{
//			number = number / 10;
//			count = count + 1;       // 或者 count++
//		}
//		System.out.println("输入的数字是" + count + "位数");
		
		
		
		// 3-1.3   While 循环
		// 如何验证程序结果的正确性：可以使用变量表格来验证。（在纸上仿真模拟）
		// 也可以在代码中相应位置进行变量输出来验证
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		int count = 0;
//		while (number > 0) 
//		{
//			number = number / 10;
//			count = count + 1;
//			System.out.println("Number:" + number + " Count:" + count);
//		}
//		System.out.println(count);	
		// 也可以使用DEBUG方法进行调试
		
		
		// 3-1.4 do-while循环
		// do-while 后面的while后面要有分号
		
//		
//		// 3-2.1 计数循环
//		int count = 100;
//		while (count > 0 )
//		{
//			System.out.println(count);
//			count = count - 1;
//		}
//		System.out.println(count);
//		System.out.println("发射！");
		
		
		// 3-2.2 算平均数
//		Scanner in = new Scanner(System.in);
//		int sum = 0;
//		int count = 0;
//		int number = in.nextInt();
//		while (number != -1)
//		{
//			sum += number;
//			count++;
//			number = in.nextInt();
//		}
//		if (count > 0)
//		{
//			System.out.print("平均数是：" + (double)sum/count );
//		}
		
		
		// 3-2.3 猜数游戏
		// 让计算机出一个数，然后让用户来猜测数字，并作出相应的反应，直到猜到那个数。
//		Scanner in = new Scanner(System.in);
//		int number = (int)(Math.random()*100+1);    // 创建随机数 [0,1)-->[0,99)-->[1,100]
//		int count = 0;
//		int a;
//		do
//		{
//			a = in.nextInt();
//			count = count + 1;
//			if (a > number)
//				System.out.println("偏大");
//			else if (a < number)
//				System.out.println("偏小");
//		} while ( a != number);
//		System.out.println("恭喜你猜对了，你用了" + count + "次机会.");
		
		
		// 3-2.4 整数分解  (这个代码很有重复理解必要，记忆，虽然已经理解)
		// 输入一个整数来分别找出其中每位的数，或者会进行排序
		// 但是不管是否进行排序都要注意一个规律（计算规律)
		// 如果整数是number  此规律是  number%10  number/10  (以后出现类似的题目加深体会)
		// 下面的例子是输入一个整数，输出它的倒序
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		while ( number > 0 ) {
			int digit = number % 10;
			result = result * 10 + digit;
			number = number / 10;
		}
		System.out.println(result);
		
		
	}
	
}
