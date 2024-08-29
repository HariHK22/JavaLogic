package Word;
import java.util.*;

public class Captilize {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        String w="";
        str+="";
        String ns="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
                w+=c;
            else
            {
                char f=w.charAt(0);
                f=Character.toUpperCase(f);
                ns=ns+f+w.substring(1)+" ";
                w="";
            }
        }
        System.out.println(ns);
    }

}
