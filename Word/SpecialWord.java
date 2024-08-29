package Word;
import java.util.*;

public class SpecialWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String w="";
		String str=s.nextLine();
		str+=" ";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				char f=w.charAt(0);
				char l=w.charAt(w.length()-1);
				if(Character.toUpperCase(l)==Character.toUpperCase(f))
				{
					System.out.println(w);
					
				}
				w="";
				
			}
			
		}

	}

}
