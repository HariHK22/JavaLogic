package Word;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String w="";
		String str=s.nextLine();
		str+=" ";
		
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=' ')
				w+=c;
			else {
			
					count++;
				w="";
			}
		}
		
			System.out.println("Total count of words : "+count); 
	}

}
