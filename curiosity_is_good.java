import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
       int y=in.nextInt();
       int ans=0;
       for(int i=x+1;i<=y;i++)
       if(i%2==0)ans++;
       System.out.println(ans);
        
        
    }
}
