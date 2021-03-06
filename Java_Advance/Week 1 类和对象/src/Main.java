
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.1 用类制造对象
		// 对象变量和普通变量有区别，对象变量是对象的管理者而非所有者
		/*
		 *  对象是实体，需要被创建，可以为我们做事情；
		 *  类是规范，根据类的定义来创建对象；
		 *  
		 *           对象与类
		 *   对象（这只猫）
		 *     表达东西或者事件
		 *     运行时相应消息（提供服务）
		 *                                // 类定义了对象，  对象是类的实体。
		 *   类（猫）
		 *     定义所有猫的属性；
		 *     就是Java中的类型；
		 *     可以用来定义变量；
		 *     
		 *     
		 *          对象 ＝ 属性 ＋ 服务
		 *    数据：属性或者状态；
		 *    操作：函数
		 *    
		 *    把数据和对数据的操作放在一起——————》封装
		 */
		
		
		// 1.2 定义类
		/*
		 * 这个课时，我们来学习如何定义类。类由两种东西组成：表示对象由什么成员变量和表示对象
		 * 能做什么的成员函数。一旦定义了类，我们就可以创建这个类的多个对象，这些对象都会做那个类
		 * 所定义的动作（函数），但是各自具有不同的数据。
		 */
		// 这节课的内容看新创建的项目——VendingMachine（自动售货机项目）
		/*
		 *          创建对象
		 *  new VendingMachine();
		 *  VendingMachine v = new VendingMachine()
		 *  
		 *  对象变量是对象的管理者
		 */
		
		
		// 1.3 成员变量和成员函数
		/*
		 * 				成员变量
		 *  类定义了对象中所具有的变量，这些变量称作成员变量；
		 *  每个对象有自己的变量，和同一个类的其它对象是分开的；
		 *  
		 *  			函数和成员变量
		 *  在函数中可以直接写成成员变量的名字来访问成员变量；
		 *  那么究竟访问的是哪个对象呢？
		 *  函数是通过对象来调用的
		 *    v.insertMoney();
		 *    
		 *    			This
		 *    this是成员函数的一个特殊的固有的本地变量，它表达了调用这个函数的那个对象
		 *    这一点非常非常非常重要！！我来举一个例子，你就能很好理解this的作用了：
		 *    比如我们做的那个项目vendingMachine，里面我们设置了int price = 80;
		 *    但是我们希望给这个类设置一个方法函数，让新创建的对象自己来设置价格：
		 *    ...
		 *    int price = 80;
		 *    
		 *    void setPrice(int price)
		 *    {
		 *    	 price = price;      // 你希望这样调用setPrice()方法来设置price是不可行的
		 *    } 					// 因为前面的price指的是参数中的price，不是方法外的price
		 *    						// 你需要写成这样：   this.price = price;
		 *    
		 *    
		 *    			本地变量
		 *    定义在函数内部的变量是本地变量；
		 *    本地变量的生存期和作用域都是函数内部；
		 *    成员变量的生存期是对象的生存期，作用域是类内部的成员函数；
		 *    Java有立即自动回收机制，成员变量的生存期开始于一个类对象的产生，结束的时间点
		 *    则不需要程序猿关心。
		 *    
		 */
		
		
		// 1.4 对象初始化
		/*
		 *  在自定义的类中，jav会自动给没有赋予初始值的成员变量赋予0值
		 *  
		 *  		成员变量定义初始化
		 *  ·成员变量在定义的地方就可以给出初始值；
		 *  ·没有给出初始值的成员变量会自动获得0值；
		 *    ·对象成员变量的0值没有管理任何对象，也可以主动给出null值；
		 *  ·定义初始化可以调用函数，甚至可以使用已经定义的成员变量；
		 *      int something = f();
		 *      int f()
		 *      {
		 *          return 10;
		 *      }
		 *      
		 *          构造函数
		 *   ·如果有一个成员函数的名字和类的名字完全相同，则在创建这个类的每一个对象的时候
		 *   会自动调用这个函数 ---> 构造函数
		 *   ·构造函数时没有返回类型的。
		 *      甚至可以有多个构造函数：
		 *      
		 *      VendingMachine()      // 构造函数
		 *      {
		 *          total = 0;
		 *      }
		 *      VendingMachine(int price)      // 重载
		 *      {
		 *         // this（）；           这个方法会调用没有参数的构造函数，但是只能在构造函数里面出现。
		 *          this.price = price;
		 *      }
		 *      
		 *           函数重载
		 *     ·一个类可以有多个构造函数，只要它们的参数表不同；
		 *     ·创建对象的时候可以给出不同的参数值，就会自动调用不同的构造函数；
		 *     ·通过this()还可以调用其他构造函数；
		 *     ·一个类里的同名但参数表不同的函数构成了重载关系；
		 * 
		 */
		
		
	}

}
