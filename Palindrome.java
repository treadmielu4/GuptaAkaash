import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
        {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int n=sc.nextInt();
		int rev=0;
		int num=n;
		while(n>0) 
                {
			rev=rev*10;
			rev=rev+(n%10);
			n/=10;
		}
		if(rev==num) 
                 System.out.println("Palindrome");
		else 
                 System.out.println("Not a Palindrome");
	}

}
