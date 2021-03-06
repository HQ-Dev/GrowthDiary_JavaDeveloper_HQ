package clock;

public class Display {
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit)    // 创建一个构造函数
	{
		this.limit = limit;
	}
	// 需要使时针进行走动增加，所以还要有这么个方法
	public void increase()
	{
		value++;
		if (value == limit)
		{
			value = 0;
		}
	}
	// 还需要有一个方法来知道时钟展现的时间
	public int getValue()
	{
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display d = new Display(24);
		for ( ; ; )
		{
			d.increase();
			System.out.println(d.getValue());
		}
	}

}
