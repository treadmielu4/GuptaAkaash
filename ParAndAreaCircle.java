import java.util.Scanner;

public class ParAndAreaCircle 
{

	public static void main(String[] args) 
        {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the circle:");
		double PI=3.14;
		int r=sc.nextInt();
		System.out.println("Perimeter of circle:"+(2*PI*r));
		System.out.println("Area of circle:"+(PI*r*r));

	}

}
