import java.util.Scanner;

public class SumOfDigits 
{

	public static void main(String[] args) 
        {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int n=sc.nextInt();
		int rem=0,sum=0;
		while(n!=0) 
                {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println("Sum of digits:" +sum);
	}

}
