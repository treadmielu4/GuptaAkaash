import java.util.Scanner;

public class StringLength 
{

	public static void main(String[] args) 
        {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str = new String();
		str = sc.next();

		// Length of string
		System.out.println("Length of string is:" + str.length());

		// Replace all 'd' with 'f'
		System.out.println(str.replace('d', 'f'));

		// Replace fox with cat
		String str1 = "The quick brown fox jumps over the lazy dog.";
		System.out.println(str1.replace("fox", "cat"));

		// String starts with the contents of another string
		String str2 = "The";
		System.out.println(str1.startsWith(str2));

		// substring of a given string between two specified positions
		System.out.println(str1.substring(11, 21));

		System.out.println(str1.toCharArray());

		// Convert to lower case
		System.out.println(str1.toLowerCase());

		// Convert to upper case
		System.out.println(str1.toUpperCase());
		
		//trim any leading or trailing whitespace from a given string
		String str3="  Hey you! ";
		System.out.println(str3.trim());
		
		//last index of
		System.out.println(str1.lastIndexOf("quick"));
	}

}
