import java.io.*;
import java.util.*;

public class LastChanceGas {

	public static void main(String[] args) {
	Scanner GasTaker=new Scanner(System.in);
	System.out.println("What is your gas tank's capacity in gallons? ");
	int gas=GasTaker.nextInt();
	
	Scanner GaugeTaker=new Scanner(System.in);
	System.out.println("How full is your tank in percentage? ");
	int gauge=GaugeTaker.nextInt();
	
	Scanner MPGTaker=new Scanner(System.in);
	System.out.println("What is yur vehicle's MPG (Miles Per Gallon)? ");
	int MPG=MPGTaker.nextInt();
	
	if (MPG*(gas*(gauge/100))<200)
	{System.out.println("Get gas!");}
	if (MPG*(gas*(gauge/100))>=200)
	{System.out.println("Safe to Proceed");}
	}

}
