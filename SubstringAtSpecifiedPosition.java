
import java.util.*;
public class SubstringAtSpecifiedPosition 
{
	public static void main(String[] args) 
        {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter start and end position");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(str.substring(start,end));
	}

}
