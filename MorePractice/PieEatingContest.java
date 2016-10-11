import java.io.*;
import java.util.*;

public class PieEatingContest {

	public static void main(String[] args) {
	Scanner WeightTaker=new Scanner(System.in);
	System.out.println("Please enter your weight here ---> ");
	double weight=WeightTaker.nextDouble();
	
	if (weight>280)
	{System.out.println("Sorry, you are not allowed in the pie eating contest.");}
	if (weight<220)
	{System.out.println("Sorry, you are not allowed in the pie eating contest.");}
	else {System.out.println("Congratulations! You are allowed in the pie eating contest!");}
	}

}
