import java.io.*;
import java.util.*;

public class DiscountPrices {

	public static void main(String[] args) {
		
		Scanner PriceTaker=new Scanner(System.in);
		System.out.println("Enter amount of purchases in cents: ");
		int price=PriceTaker.nextInt();
		
		if (price>1000)
		{System.out.println("Discounted price: "+(price*.9)+" cents");}
		else {System.out.println("No discount, your price remains: "+price+" cents");}
	}

}
