import java.util.Scanner;

public class FactorialFunction {
	
	static int fac(int n)
	{
		int fac=1;
		for(int i=n;i>0;i--)
			fac *= i;
		return fac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		System.out.println("factorial is : " + fac(num));

	}

}
