package Word;
import java.util.*;

public class Exist {

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
				if(w.equalsIgnoreCase("MoM"))
					count++;
				w="";
			}
		}
		if(count!=0)
		{
			System.out.println("Found");
		}
		else
			System.out.println("Not Found"); 
	}

}
