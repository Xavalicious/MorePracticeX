import java.io.*;
import java.util.*;

public class AddingUpIntegers {

	/*public static void main(String[] args) {
	System.out.println("How many integers will be added?");
	Scanner IntTaker=new Scanner(System.in);
	int a=IntTaker.nextInt();
	int c = 0;
	
	for (int x=0; x<a; x++)
	{
	System.out.println("Enter an integer:");
	Scanner IntTaker1=new Scanner(System.in);
	int b=IntTaker1.nextInt();
	c += b;
	System.out.println(b);
	}
	System.out.println("The sum is: ");
	System.out.println(c);*/
	
	public static void main(String[] args) {
		System.out.println("How many integers will be added?");
		Scanner IntTaker=new Scanner(System.in);
		int a=IntTaker.nextInt();
		int c = 0;
		int x=0;
		while (x<a)
		{
		x++;	
		System.out.println("Enter an integer:");
		Scanner IntTaker1=new Scanner(System.in);
		int b=IntTaker1.nextInt();
		c += b;
		}
		
		System.out.println("The sum is: ");
		System.out.println(c);
	}

}
