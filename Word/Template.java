package Word;
import java.util.*;

public class Template {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String w="";
	String str=s.nextLine();
	str+=' ';
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if(c!=' ')
			w+=c;
		else {
			//Separate the word from String 
			//System.out.println(w);
			//Print First character
			//System.out.print(w.charAt(0));
			//Print an first two character of an String 
			System.out.println(w.substring(0, 2));
			w="";
		}
		
	}

	}

}
