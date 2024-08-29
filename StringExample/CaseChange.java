package StringExample;
import java.util.*;

public class CaseChange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String r="",str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			
			char c= str.charAt(i);
			if(Character.isUpperCase(c))
				r=r+Character.toLowerCase(c);
			else
				r=r+Character.toUpperCase(c);
				
		}
		System.out.println("After Reverse the Cases");
		System.out.println(r);

	}

}
