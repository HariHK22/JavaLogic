package StringEx;
import java.util.*;

public class Traversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0;i<s.length();i++)
		{
			char h = s.charAt(i);
			System.out.println(h+" "+(int)h);
		}

	}

}
