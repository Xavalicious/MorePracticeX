import java.io.*;
import java.util.*;
import java.util.*;

public class StartEndValues {

	/*public static void main(String[] args) {
		Scanner StartTaker=new Scanner(System.in);
		System.out.println("Enter Start: ");
		int a=StartTaker.nextInt();
		
		Scanner EndTaker=new Scanner(System.in);
		System.out.println("Enter End: ");
		int b=EndTaker.nextInt();
		
		for (int c=0; a!=(b+1); c++)
		{System.out.println(a);
			a=a+1;
		}*/
		
		public static void main(String[] args) {
			Scanner StartTaker=new Scanner(System.in);
			System.out.println("Enter Start: ");
			int a=StartTaker.nextInt();
			
			Scanner EndTaker=new Scanner(System.in);
			System.out.println("Enter End: ");
			int b=EndTaker.nextInt();
			
			int c=0;
			while(a!=(b+1))
			{c=c+1;
				System.out.println(a);
				a=a+1;
			}

	}

}
