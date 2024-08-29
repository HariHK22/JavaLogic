package StringExample;
import java.util.*;

public class PigLatin {
	public static void main(String[]args)
	{
		Scanner s =new Scanner(System.in);
		String p="",str=s.nextLine().toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='E'||u=='A'||u=='I'||u=='O'||u=='U')
			{
				if(i==0)
					p=str+"WAY";
				else
					p=str.substring(i)+str.substring(0,i)+"AY";
				break;    
			}
		}
		System.out.println(p);
	}

}
