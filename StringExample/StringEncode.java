package StringExample;
import java.util.*;

public class StringEncode {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String enc="";
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if(c=='Z'||c=='z'||c=='Y'||c=='y')
			c-=26;
		c+=2;
		enc=enc+c;
	}
	System.out.println(enc);

}}
