import java.util.*;
public class Complex {
	int real,imag;
	Complex(int r,int i)
	{
		this.real=r;
		this.imag=i;
	}
	static void sum(Complex a,Complex b)
	{
		System.out.println("Sum is : "+(a.real+b.real)+"i + "+(a.imag+b.imag)+"j");
	}
	static void diff(Complex a,Complex b)
	{
		System.out.println("Difference is : "+(a.real-b.real)+"i + "+(a.imag-b.imag)+"j");
	}
	static void product(Complex a,Complex b)
	{
		System.out.println("Product is : "+(a.real*b.real)+"i + "+(a.imag*b.imag)+"j");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Complex> l=new ArrayList<Complex>();
		l.add(new Complex(sc.nextInt(),sc.nextInt()));
		l.add(new Complex(sc.nextInt(),sc.nextInt()));
		sum(l.get(0),l.get(1));
		diff(l.get(0),l.get(1));
		product(l.get(0),l.get(1));
		sc.close();
	}
}
