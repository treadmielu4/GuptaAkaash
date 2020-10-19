import java.util.Scanner;

public class Swap 
{
	public static void main(String args[]) 
        {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Nos before swapping:"+a+" & " +b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Nos after swapping:"+a+ " & " +b);
	}
}
