package StringExample;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String rev="",str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			rev=c+rev;
		}
		if(str.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		System.out.println(rev);
	}

}
