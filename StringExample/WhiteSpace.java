package StringEx;
import java.util.*;

public class WhiteSpace {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String w = "",str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			if(Character.isWhitespace(c))
				w=w+c;
			
		}
		System.out.println(w);
				

	}

}
