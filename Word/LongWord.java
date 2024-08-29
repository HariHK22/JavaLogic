package Word;
import java.util.*;

public class LongWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String w="";
		String str=s.nextLine();
		str+=" ";
		String lw="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=' ')
				w+=c;
			else {
				if(w.length()>lw.length())
					lw=w;
				w="";
			}
		}
		System.out.println(lw);

	}

}
