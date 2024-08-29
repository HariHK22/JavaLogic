package StringExample;
import java.util.*;

public class AllWhitespace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine(),str1="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!Character.isWhitespace(c))
				str1=str1+c;
		}
		System.out.println("Without White space : "+str1);

	}


}
