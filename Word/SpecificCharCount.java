package Word;

import java.util.Scanner;

public class SpecificCharCount {
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
			
				if(w.endsWith("D")||w.endsWith("d"))
					count++;
				w="";
			}
		}
		
			System.out.println("Number of words end with d or D : "+count);
	}

}
