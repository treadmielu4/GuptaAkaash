
import java.util.*;

public class LargeSmallNumber 
{
	
	public static void main(String[] args) 
        {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) 
                {
			arr[i]=sc.nextInt();
		}
		int large=arr[0],small=arr[0];
		for(int i=0;i<n;i++) 
                {
			if(arr[i]>large)  
                        {
				large=arr[i];
			}
			else if(arr[i]<small) 
                        {
				small=arr[i];
			}
		}
		System.out.println("Largest number is: "+large +" Smallest number is: "+small);
		
	}

}
