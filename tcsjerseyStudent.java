import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
         int[] arr=new int[n];
         int[] brr=new int[n];
         int c=1;
          
          
         for(int i=0;i<n;i++)
         {
             arr[i]=in.nextInt();
             brr[i]=i+1;
         }
         
        
       for(int i=0;i<n;i++)
       {
          if(arr[i]!=brr[i])c++;
          //System.out.println(arr[i]);
       }
        
        
        
         System.out.println(c);
         System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(brr));
        
    }
}
