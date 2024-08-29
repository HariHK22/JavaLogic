package StringEx;
import java.util.*;
public class Vowels {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str =s.nextLine().toUpperCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='A'||c=='E'||c=='O'||c=='I'||c=='U')
			{
				count++;
		    }
	     }
		System.out.println("The total Vowels:"+count);
	}

}
