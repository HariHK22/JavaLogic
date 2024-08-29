package StringExample;
import java.util.*;

public class FNonRepeat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            char c=str.charAt(i);
            for(int j=0;j<str.length();j++)
            {

                char d=str.charAt(j);
                if(c==d)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(c);
                break;
            }

        }
    }
}
