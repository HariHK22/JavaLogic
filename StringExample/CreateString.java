package StringExample;
import java.util.*;

public class CreateString {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		String st1="";
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
				st1=st1+c;
		}
		System.out.println(st1);	
	}

}
