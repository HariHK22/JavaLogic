package Word;
import java.util.*;

public class ChangeWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =s.nextLine();
        str+=" ";
        String w="";
        String ns="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
                w+=c;
            else{
                if(w.equalsIgnoreCase("red"))
                     ns=ns+"Blue"+" ";
                else
                    ns=ns+w+" ";w="";


            }

        }
        System.out.println(ns);


    }
}
