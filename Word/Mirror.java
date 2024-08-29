package Word;

import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        String w="";
        str+=" ";
        String ns="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
                w=c+w;
            else
            {
                ns=ns+w+" ";
                w="";
            }
        }
        System.out.println(ns);
    }
}
