import java.util.Scanner;

public class ArrayOddOrEven 
{

	public static void main(String[] args) 
        {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer ar[]=new Integer[n];
		for(int i=0;i<n;i++) 
                 ar[i]=sc.nextInt();
		for(int i=0;i<n;i++) 
                {
			if(ar[i]%2==0) 
			 System.out.println(ar[i] +" is Even");
			else 
		         System.out.println(ar[i] +" is Odd");
			
		}
	}

}
