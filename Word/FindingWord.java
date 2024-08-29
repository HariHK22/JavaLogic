package Word;
import java.util.*;

public class FindingWord {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String w="";
		String str=s.nextLine();
		str+= ' ';
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				//For starting
			//if(w.startsWith("R"))
			//for ending
			//if(w.endsWith("ED")||w.endsWith("ed"))
			//for word containing E	
			//if(w.contains("E"))
			if(w.length()==3)	
				System.out.println(w);
			w= "";}
		}

	}

}
