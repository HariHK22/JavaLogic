package StringExample;
import java.util.*;
public class Cases {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if(Character.isUpperCase(c))
		{
			System.out.println("UPPER CASES");
			System.out.println(c);
		}
		 if(Character.isLowerCase(c))
		{
			System.out.println("LOWER CASES");
			System.out.println(c);
		}
		 if(Character.isDigit(c))
		{
			System.out.println("DIGITS");
			System.out.println(c);
		}
	}
	}
	

}
