package StringExample;
import java.util.*;

public class CountCases {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str =s.nextLine();
		
		int countu=0;
		int countl=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
			   countu++;
			}
			if(Character.isLowerCase(c))
			{
			   countl++;
			}
		}
		System.out.println("Upper Case"+countu);
		System.out.println("Lower Case"+countl);
	}

}
