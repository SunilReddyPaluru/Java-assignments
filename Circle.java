import java.util.*;
public class Circle {
	private
		double radius;
		String color="red";
	Circle()
	{
		this.radius=1.0;
	}
	Circle(double r)
	{
		this.radius=r;
	}
	void getArea()
	{
		System.out.println("Area is : "+(3.142)*this.radius*this.radius);
	}
	void getRadius()
	{
		System.out.println("Radius is : "+this.radius);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		Circle c1=new Circle();
		c1.radius=sc.nextDouble();	
		sc.close();
		c.getRadius();
		c.getArea();
		c1.getRadius();
		c1.getArea();
	}
}
