

import java.util.Scanner;
public class ConvertToCharArray 
{

	public static void main(String[] args) 
{
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = new char[s.length()];
		ch=s.toCharArray();
		for(int i=0;i<s.length();i++) 
                 System.out.print(ch[i]+" ");
		

	}

}
