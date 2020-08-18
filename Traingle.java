import java.lang.Math; 
import java.util.*;
public class Triangle 
{
	static double Area(double a,double b,double c)
	{
		double s=((a+b+c)/2);
		return (Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c))*100.0)/100.0);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.println(Area(a,b,c));
		sc.close();
	}
}
