
import java.util.Scanner;
public class SwapAndFact {
	
	public static int recFactorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			
			return n*recFactorial(n-1);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num2=num1+num2;
		num1=num2-num1;
		num2=num2-num1;
		System.out.println("num1: "+num1+" num2: "+num2);
		sc.close();
		
		System.out.println("factorial using recursion for num1 and num2 is :"+recFactorial(num1)+" and "+recFactorial(num2));
		

	}

}
