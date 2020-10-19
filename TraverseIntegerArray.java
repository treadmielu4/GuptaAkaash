
import java.util.*;

public class TraverseIntegerArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+ " is Even number.");
			}
			else
			{
				System.out.println(arr[i]+" is ODD number");
			}
		}
		
	}

}
