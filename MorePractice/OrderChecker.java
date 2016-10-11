import java.io.*;
import java.util.*;

public class OrderChecker {

	public static void main(String[] args) {
	Scanner BoltTaker=new Scanner(System.in);
	System.out.println("Enter number of bolts: ");
	int bolts=BoltTaker.nextInt();
	
	Scanner NutTaker=new Scanner(System.in);
	System.out.println("Enter number of nuts: ");
	int nuts=NutTaker.nextInt();
	
	Scanner WasherTaker=new Scanner(System.in);
	System.out.println("Enter number of washers: ");
	int washers=WasherTaker.nextInt();
	
	System.out.println("Number of bolts: "+bolts);
	System.out.println("Number of nuts: "+nuts);
	System.out.println("Number of washers: "+washers);
	System.out.println();
	
	System.out.println("Check the Order: ");
	
	if (bolts>nuts)
		{
		System.out.println("too few nuts");
		}
	
	if ((2*washers)<bolts)
		{
		System.out.println("too few washers");
		}
	else {
		System.out.println("Order is OK.");
	}
	System.out.println("Total cost: "+((washers*.01)+(bolts*.05)+(nuts*.03)));
	
	}
}	
	
	
	


