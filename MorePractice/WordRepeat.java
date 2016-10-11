import java.io.*;
import java.util.*;

public class WordRepeat {

	public static void main(String[] args) {
	Scanner WordTaker=new Scanner(System.in);
	System.out.println("Please ebter a word here--> ");
	String word=WordTaker.next();
	int c=word.length();
	for (int a=0; a<c; a++)
	{System.out.println(word);
	}
	}

}
