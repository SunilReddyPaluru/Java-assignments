import java.util.Scanner;
class Rectangle {
	int height,width;
	void display()
	{
		System.out.println("Width: "+this.width+" and Height: "+this.height);
	}
}
class RectangleArea extends Rectangle
{
	void read_input()
	{
		Scanner sc=new Scanner(System.in);
		width=sc.nextInt();
		height=sc.nextInt();
		sc.close();
	}
	void display(int width,int height)
	{
		System.out.println("Area is: "+width*height);
	}
}
public class test
{
	public static void main(String[] args)
	{
		RectangleArea r=new RectangleArea();
		r.read_input();
		r.display();
		r.display(r.width,r.height);
	}
}
