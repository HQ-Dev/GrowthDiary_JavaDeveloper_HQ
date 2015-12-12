package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300);
		Circle c1 = new Circle(65,218,65);  // 天平左边的大圆：圆心坐标和半径
		Rectangle r1 = new Rectangle(160, 300, 100, 30);    // 矩形，参数是一个起始坐标和宽高
		Triangle t1 = new Triangle(160, 300, 260, 300, 210, 250);  // 确定三角形的三个点的坐标
		Line l1 = new Line(0,300,420,200);
		Circle c2 = new Circle(375,164,45); // 天平右边的小圆
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();	
	}
}
