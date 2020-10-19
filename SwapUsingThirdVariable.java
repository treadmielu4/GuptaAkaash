import java.util.Scanner;

public class SwapUsingThirdVariable 
{
	public static void main(String args[]) 
{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		System.out.println("Nos before swapping:"+a+" & " +b);
		c=a;
		a=b;
		b=c;
		System.out.println("Nos after swapping:"+a+ " & " +b);
	}
}
