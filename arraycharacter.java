
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char[] brr=new char[200];
        char[] c=new char[n];
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
        System.out.println(Arrays.toString(arr));
     
       
        int i=0;
        char ch='a';
        while(i<n)
        {
             
            brr[i]=(char)ch;
             ch++;
             i++;
          
        }
        
         int k=1000;
          int z=n-1;
         while(k-->-10)
         {
            
             for(int l=0;l<n;l++)
             {
                 if(k==arr[l])
                 {
                     c[l]=brr[z];
                     z--;
                 }
                 
             }
             
         }
         System.out.println(Arrays.toString(c));
        
        
    }
}
