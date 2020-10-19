import java.util.Scanner;

public class FibonacciWithRecursion 
{

	public static void main(String[] args) 
        {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	
	static int fib(int n) 
        {
		if(n<=1) return n;
		return fib(n-1)+fib(n-2);
	}

}
