import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
         ArrayList<Integer>brr=new ArrayList<>();
        // int[] crr=new int[n*2];
          int i=0;
          
         for(;i<n*2;i++)
         {int a=in.nextInt();
         if(a>0)arr.add(a);
         else brr.add(a);
         }
         
         int x=in.nextInt();
         int s=x+n;
       for(;i<n*2;i++)
       {
           s=s+arr.get(i)+brr.get(i);
       }
        
        
        
         System.out.println(s);
         //System.out.println(Arrays.toString(arr));
         //System.out.println(Arrays.toString(brr));
        
    }
}
