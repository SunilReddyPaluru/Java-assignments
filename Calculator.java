import java.util.*;
public class Calculator {
	interface op1
	{
		void add(int x,int y);
	}
	interface op2
	{
		void difference(int x,int y);
	}
	interface op3
	{
		void product(int x,int y);
	}
	interface op4
	{
		void safeDivision(int x,int y);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.print("Enter the operation (+ or - or * or /) to perform : ");
		char c=sc.next().charAt(0);
		op1 add=(int a,int b)->{
			System.out.println(a+b);
		};
		op2 difference=(int a,int b)->{
			System.out.println(a-b);
		};
		op3 product=(int a,int b)->{
			System.out.println(a*b);
		};
		op4 safeDivision=(int a,int b)->{
			System.out.println(a/b);
		};
		sc.close();
		switch(c)
		{
		case('+'):
		{
			add.add(m,n);
			break;
		}
		case('-'):
		{
			difference.difference(m,n);
			break;
		}
		case('*'):
		{
			product.product(m,n);
			break;
		}
		case('/'):
		{
			safeDivision.safeDivision(m,n);
			break;
		}
		default:
			System.out.println("Invalid operation!");
		}
	}
}
