package StringExample;
import java.util.*;

public class StringDigitChar {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		String strc="",str1=s.nextLine(),strd="";
		for(int i=0;i<str1.length();i++)
		{
			char c= str1.charAt(i);
			if(Character.isAlphabetic(c))
			{
				strc=strc+c;
			}
			if(Character.isDigit(c))
			{
				strd=strd+c;
			}
		}
		
		System.out.println("Digit : "+strd);
		System.out.println("Character : "+strc);
		String d=strd+strc;
		System.out.println(d);
	}

}
