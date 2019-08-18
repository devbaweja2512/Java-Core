// function to check number is armstrong or not
import java.util.Scanner;
public class IsArmstrong {

	
	static boolean isarmstrong(int num)
	{
		int count=0; 
		for(int temp=num;temp>0;temp /= 10 , count++) ; // null loop
		int sum=0;
		for(int temp=num;temp>0;temp /= 10)
			sum += Math.pow(temp%10,count);
		if(sum==num)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		if(isarmstrong(num))
			System.out.println(num+" armstrong number");
		else 
			System.out.println(num+" NOT armstrong number");
		
	}

}


