package Word;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        str+=" ";
        int count=0;
        String w="",ns="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
                w+=c;
            else
            {
                if(count++%2==0)
                {
                    ns=ns+w.toUpperCase()+ " ";
                }
                else
                    ns=ns+w.toLowerCase()+" ";w="";

            }

        }
        System.out.println(ns);

    }

}
