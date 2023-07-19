import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int rev=0;
        int pos=0;
        int k=31;
        int bitmask=1<<pos;
        while(k-->=0)
        {
        if((bitmask&n)!=0)
        {
           rev^=1;
        }
        rev<<=1;
        n>>=1;
        }
        System.out.println(rev);
    }
}
