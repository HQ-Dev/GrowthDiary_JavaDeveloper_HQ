import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5-1 数组
		// 如何写出一个程序计算用户输入的数字的平均数，并输出所有大于平均数的数字？
		// 那就需要记录所有输入进来的数字，那用上面办法呢？
		// 其实现在我们要接触新的东西，就是：数组！
		
//		Scanner in = new Scanner(System.in);
//		int x;      // x 表示输入的数字
//		int [] numbers = new int[100];     // 定义了一个数组numbers，它数组数量是100,类型是int
//		double sum = 0;      // 定义了所有数字的和
//		int cnt = 0;         // 这个变量记录输入了多少个数字
//		x = in.nextInt();
//		while ( x != -1)            // 当输入－1的时候，表示告诉程序我停止输入数字了（“前面输入的数字已经够了”）
//		{
//			numbers[cnt] = x;       // cnt刚开始是0
//			sum += x;
//			cnt ++;              
//			x = in.nextInt();
//		}
//		if (cnt > 0)                 // 下面的代码就是如何输出大于平均数的输入数字
//		{
//			double average = sum/cnt;
//			System.out.println(average);       
//			for (int i = 0; i<cnt; i++)
//			{
//				if (numbers[i] > average)
//				{
//					System.out.println(numbers[i]);
//				}
//			}
//		}       // 其实上面这个代码段是有安全隐患的，就是数组个数确定为了100，如果输入的数字数量大于100个就会导致异常；
		        // 解决方法可以是数组的数量改为变量，然后后面的代码做小修改即可，另一种方法，仍然确定数组的数量，但是
		        // 可以再下面的 while() 循环条件中加上当 cnt > 99 的时候跳出循环即可
		
		
		// 5-1.2 创建数组 下面介绍数组在Java中的一些特性
		/*
		 * 是一种容器，特点是：
		 *  其中所有的元素具有相同的数据类型；
		 *  一旦创建， 不能改变大小；
		 *  即，比如 new int[100]; 之后就是确定的100个了，不能再改变大小
		 *  
		 *       定义数组变量
		 *   <类型>[]<名字> = new <类型>[元素个数];  下面是例子：
		 *   int[] grades = new int[100];
		 *   double[] averages = new double[20];
		 *   
		 *   相关要求：
		 *   元素个数必须给出
		 *   元素个数必须是整数
		 *   元素个数可以是变量     int[] numbers = new in[n];
		 *   int[100] number;   ❌ 这样是一个语法错误；
		 *   
		 */
		
		
		// 5-1.3  数组元素
		// 访问数组中的元素，是通过索引（下标）来访问的。
		/*         有效的下标
		 * ＊最小的下标是0，最大的下标是数组的元素个数－1
		 * ＊可是编译器不会检查看你是否使用了有效的下标
		 * ＊但是如果运行的时候出现了无效的下标，可能会导致程序终止
		 * 
		 * 例子：如果数组的大小是100个，你编写 int[-1] = 11; int[100] = 12;
		 * 编译器不会报错，但是运行的话，就会导致异常exception in thread 
		 * （array index out of bound）
		 * 
		 *           Length
		 *   数组中还有一个属性，就是Length, 会告诉你它的元素的数量
		 *   那么如何使用它呢，请看下面优雅的代码：
		 *   
		 *   for (int i = 0; i < 100; i++)
		 *       sum += grade[i];
		 *   最好是这样：
		 *   for (int i = 0; i < grade.length; i++) 
		 *       sum += grade[i];
		 *   (这样的方法可读性很强，看的人可以直接了解遍历什么内容，并且很重要的一点，它是具有
		 *   可扩展性的。因为有可能，将来你也许会改变数组的大小，但是这个遍历中的条件你是不需要
		 *   进行修改的。)
		 */
		
		
		
		// 5-1.4 投票统计
		// 写一个程序，输入数量不确定的范围再［0，9］之间的整数，统计每一种数字出现的次数
		// ,输入－1表示结束。
//		Scanner in = new Scanner(System.in);
//		int x;
//		int[] numbers = new int[10];
//		x = in.nextInt();
//		while ( x != -1) 
//		{
//			if ( x >= 0 && x <= 9)
//			{
//				numbers[x]++;
//			}
//			x = in.nextInt();
//		}
//		for (int i = 0; i < numbers.length; i++)
//		{
//			System.out.println(i + ":" + numbers[i]);
//		}
		
		
		// 5-2.1 数组变量
		// java语言可以直接给没有初始化的数组赋值0
		// 也可以直接初始化数组
		/*
		 * new创建的数组会得到默认的0值
		 * int[] scores = {87,90,78,90,99,79,89,89,78};    也可以直接赋值
		 * 直接用大括号给出数组的所有元素的初始值
		 * 不需要给出数组的大小，编译器会帮你数数（length）
		 */
//		Scanner in = new Scanner(System.in);
//		int[] scores = {89,88,87,78,79,90,98,86};
//		System.out.println(scores.length);
//		for (int i=0; i < scores.length; i++)
//		{
//			System.out.print(scores[i] + " ");
//		}  // 使用数组的特性 length 将会有很好的扩展性，你可以再数组中随意再添加分数
		
	   // 接下来要讲在java中
		/*
		 * 数组变量是数组的管理制而非数组本身；
		 * 数组必须创建出来然后交给数组变量来管理；
		 * 数组变量之间的赋值是管理权限的赋予；
		 * 数组变量之间的比较是判断是否管理同一个数组；
		 */
//		Scanner in = new Scanner(System.in);
//		int[] a = new int[10];
//		a[0] = 5;
//		int[] b = a;
//		System.out.println(a[0]);   // 是5
//		b[0] = 16;
//		System.out.println(a[0]);   // 结果也是16，不是5，因为它们数组变量a和b都管理
//		// 同一个数组。
		
//		int[] a = {1,2,3,4,5};
//		int[] b = {2,3,4,5,6};    
//		System.out.println(a==b);
		// 打印的结果是false，即使 int[] b = {1,2,3,4,5}; 比较两个数组变量是否相同
		// 答案还是不相同，因为即使内容是相同的，但它们管理的数组变量并不是同一个
		
		
		// 5-2.2 遍历数组
		// 在一组给定的数据中，如何找出某个数据是否存在？
//		Scanner in = new Scanner(System.in);
//		int[] data = {3,2,5,7,4,9,11,34,12,28};
//		int x = in.nextInt();
//		System.out.println("你输入的数字是："+x);
//		int loc = -1;    // 这个变量用来记录找到的那个数据
//		for (int i = 0; i < data.length; i++)
//		{
//			if (x == data[i])
//			{
//				loc = i;
//				break;
//			}
//		}
//		if (loc > -1) 
//		{
//			System.out.println(x + "是该数组中第"+ (loc + 1)+ "个数字");
//		}
//		else
//		{
//			System.out.println("该数组中没有这个数字");
//		}
		
		// 这个办法的寻找，效率是不高的，以后会有更好的解决方法
		// 下面如果我们只想知道到底有没有这个数，可以这样来
//		Scanner in = new Scanner(System.in);
//		int[] data = {3,54,6,2,3,9,12};
//		int x = in.nextInt();
//		System.out.println("你输入的数字是："+x);
//		boolean found = false;
//		for (int k : data )    // int k : data 特别适合遍历数组中的循环，但是它没有位置
//		{ 						// 它有自己适合的地方，k的含义联系代码就明白了
//			if ( k == x )       // 这个循环可以读出数组中的每一个数据，但是你不能改变其中
//			{					// 的数据     它叫做 for - each 循环
//				found = true;    // 它的格式    for (<类型><变量>:<数组>) {...}
//				break;           
//			}
//		}
//		System.out.println("该数组中有这个数字");
		
		
		
		// 5-2.3 素数
		/*
		 * 对于前面介绍过的如何得出一个范围内的素数，我们可以有更好的方法来简化程序中循环
		 * 的次数，一种方法是：
		 *    去掉偶数后，从3到x-1，每次加2
		 *    if (x == 1 || x%2 == 0 && x!= 2)
		 *    {
		 *        isPrime = false;
		 *    }
		 *    else
		 *    {
		 *        for (int i = 3; i < x; i += 2)       这样的循环次数当n很大时，
		 *        {									循环次数大约可以表示为 n/2
		 *            if (x % i == 0)
		 *            {
		 *                isPrime = false;
		 *                break;
		 *            }
		 *        }
		 *     }
		 *    
		 *    其实还可以有更快的方法，这要从数学上来解决了。
		 *    只需要循环sqrt（x）遍
		 *    从n-->n/2-->sqrt(n)
		 *    示例：
		 *    for (int i = 3; i < Math.sqrt(x); i += 2)
		 *    {
		 *        if (x % i == 0)                    sqrt(x)计算的是平方根
		 *        {
		 *            isPrime = false;
		 *            break;
		 *        }
		 *    }
		 *    
		 *   那么还有没有更加好的方法了吗？
		 */
		// 还有一个更快的方法：
		// 判断是否能被已经知道的并且<x的素数整除
		// 假如我们现在需要构造前50个素数的表
		// 根据我们已经产生出来的素数来判断下一个数到底是不是素数
//		Scanner in = new Scanner(System.in);
//		int[] primes = new int[50];    // 定义这个数组变量来存放我们发现的素数，定义50个
//		primes[0] = 2;           // 首先我们知道2是素数，所以数组第一个就是它
//		                        // 接下来就是把发现的素数往数组变量中放入
//		int cnt = 1;         // cnt＝1有两层含义：一层是，现在有一个素数，第二层是，那一个再发现什么，要将它放到primes[cnt=1]当中
//		MAIN_LOOP:
//		for ( int x = 3; cnt < 50; x++)  // 因为2是素数，已经放入了，所以从3开始，因为条件是构造前50个素数，所以条件是 cnt < 50
//		{                                // 这个循环中要做的事就是，将要判断是不是素数的x来分别除以已经存在的素数，如果能被整除，就不是素数，如果不能被整除，就添加到primes[]当中
//			for (int i = 0; i < cnt; i++)
//			{
//				if (x % primes[i] == 0)    // 如果不是素数，就对下一个数进行循环，看下一个数是不是素数
//				{
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x;
//		}                                // 完成后可以得到前50个素数，即得到了一个素数表
//		//使用 for - each 循环得到所有的前50个素数
//		for (int k : primes)
//		{
//			System.out.print(k + " ");
//		}
		
		// 上面这个方法的效率会提高很多，可是这仍然是一个传统的方法
		// 我们从计算机的思维来考虑问题
		/*
		 *       构造n以内的素数表
		 * 1.令x为2
		 * 2.将2x、3x、4x直至ax<n的数标记为非素数
		 * 3.令x为下一个没有被标记为非素数的数，重复2；直到所有的数都已经尝试完毕
		 * 这样剩下的数就是素数了（素数乘以2后就不是素数了，将这些数择出来后，剩下的就是素数）
		 * 
		 * 用程序的语言来说就是
		 * 1.创建prime为boolean[n]，初始化其所有元素为true，prime[x]为true表示x是素数
		 * 2.令x＝2 （然后2的倍数都标记为false）
		 * 3.如果x是素数，则对于（i=2;x*i<n;i++）令prime[i*x]=false
		 * 4.令x++，如果x<n，重复3，否则结束
		 * 示例如下：
		 */
//		Scanner in = new Scanner(System.in);
//		boolean[] isPrime = new boolean[100];   // 这个意思是观察100以内的数字那些是素数。因为java会对为初始化的数组都赋予0，这不符合我们要给数组中每个数据都是true的规定，所以我们要先做以下操作
//		for (int i = 0; i < isPrime.length; i++)
//		{
//			isPrime[i] = true;
//		}
//		for (int i = 2; i < isPrime.length; i++)
//		{
//			if ( isPrime[i])     // 如果这个数是素数，则做一个遍历,它的2倍3倍4倍都标记为非素数素数
//			{
//				for (int k = 2; i*k < isPrime.length; k++)    // k 表示倍数
//				{
//					isPrime[i*k] = false;
//				}
//			}
//		}
//		for (int i = 2; i < isPrime.length; i++)
//		{
//			if ( isPrime[i] )
//			{
//				System.out.print(i + " ");
//			}
//		}
		
		
		
		// 5-2.4 二维数组
		// 以上我们讲的都是一维数组
	    /* int[][] a = new int[3][5];
	     * 通常理解为a是一个3行5列的矩阵:
	     *  a[0][0] | a[0][1] | a[0][2] | a[0][3] | a[0][4]
	     *  a[1][0] | a[1][1] | a[1][2] | a[1][3] | a[1][4]
	     *  a[2][0] | a[2][1] | a[2][2] | a[2][3] | a[2][4]
	     * 	
	     * 如果我们要遍历一个二维数组，就表示我们要进行一个两层的循环
	     * for (i = 0; i < 3; i++)
	     * {
	     *     for (j = 0; j < 5; j++)
	     *     {
	     *         a[i][j] = i*j;
	     *     }
	     * }
	     * @ a[i][j]是一个int
	     * @ 表示第i行第j列上的单元
	     *     a[i,j]并不存在
	     *     
	     *     
	     *       二维数组的初始化
	     *   int[][] a = {
	     *       {1,2,3,4},
	     *       {1,2,3},
	     *   }            // 表示两行四列
	     * 编译器来数数；
	     * 每行一个｛｝，逗号分隔
	     * 最后的逗号可以存在，有古老的传统
	     * 如果省略，表示补零
	     * 
	     */
		
		/*        tic-tac-toe游戏      井字棋
		 *  读入一个3*3的矩阵，矩阵中的数字为1表示该位置上有一个x，
		 *  为0表示为0
		 *  程序判断这个矩阵中是否有获胜的一方，输出表示获胜的一方
		 *  的字符x或者0，或输出无人获胜
		 * 示例如下
		 */
//		Scanner in = new Scanner(System.in);
//		final int SIZE = 3;
//		int[][] board = new int[SIZE][SIZE];    // 定义一个矩阵
//		boolean gotResult = false;         // 需要一个变量来表示是否得到了结果，一开始必然是没有得到
//		int numOfX = 0;                 // 记录是否有一个数字已经达到3了
//		int numOfO = 0;               
//		
//		// 首先需要读入这个矩阵
//		for (int i = 0; i < board.length; i++)      // 原先是 i < SIZE, 后改成左边
//		{
//			for (int j = 0; j < board[i].length; j++)
//			{
//				board[i][j] = in.nextInt();
//			}
//		}
//		
//		// 检查行
//		for (int i = 0; i < SIZE; i++)
//		{
//			for (int j = 0; j < SIZE; j++)
//			{
//				if (board[i][j] == 1)
//				{
//					numOfX += 1;
//				}
//				else
//				{
//					numOfO += 1;
//				}
//			}
//			if (numOfX == SIZE || numOfO == SIZE)
//			{
//				gotResult = true;
//				numOfX = 0;
//				numOfO = 0;
//				break;
//			}
//		}
//		
//		// 检查列
//		
//		for (int j = 0; j < SIZE; j++)
//		{
//			for (int i = 0; i < SIZE; i++)
//			{
//				if (board[i][j] == 1)
//				{
//					numOfX += 1;
//				}
//				else
//				{
//					numOfO += 1;
//				}
//			}
//			if (numOfX == SIZE || numOfO == SIZE)
//			{
//				gotResult = true;
//				numOfO = 0;
//				numOfX = 0;
//				break;
//			}
//		}
//		
//		// 检查对角线
		
		
		
		// 分割线
	}

}
