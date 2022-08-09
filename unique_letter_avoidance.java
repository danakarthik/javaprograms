import java.util.StringTokenizer;  
import java.util.*;
public class Simple {
   static void unique(String str)
    {
		int c;
       String[] words = str.split("\\W");
        for (int i = 0; i < words.length; i++) {
		c = 1;
		for (int j = i + 1; j < words.length; j++)
			{
           if (words[i].equalsIgnoreCase(words[j]))
			   {
				   c++;
                    words[j] = "";
                }
            }
            if (c == 1 && words[i] != "")
			{
			System.out.println(words[i]);
			}
        }
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        unique(str);
    }
}
