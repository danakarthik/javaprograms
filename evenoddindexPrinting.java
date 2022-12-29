import java.util.*;
public class MyClass {
    public static void main(String args[]) {
   
   Scanner in=new Scanner(System.in);
    int tc=in.nextInt();
     for(int j=0;j<tc;j++)
     {
   int n=in.nextInt();
  
   int[] arr=new int[n];
   int c=0,c2=0;
   int ind=0,index=0;
   
   for(int i=0;i<n;i++)arr[i]=in.nextInt();
     // System.out.println("Sum of x+y = " + z);
    
     for(int i=0;i<n;i++)
     {
        if(arr[i]%2==0) 
        {
            c+=1;
            ind=i;
        }
        else
         {
             c2+=1;
             index=i;
         }
     }
     if(c==1)
     {
         System.out.println(ind+1);
     }
     else if(c2==1)
     {
         System.out.println(index+1);
     }
   
     }
    }
}
