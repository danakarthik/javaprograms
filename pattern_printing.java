import java.util.*;
public class MyClass {
    public static void main(String args[]) {
   Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   if(n==1) 
   {
       System.out.println("1");
       
   }
   else
   {
       System.out.println("1");
   for(int i=2;i<=n;i++)
   {
        for(int k=0;k<i-1;k++)
       {
           System.out.print(i+"*");
       }
       System.out.print(i);
         System.out.println();
      
    }
    for(int j=n;j>=2;j--)
   {
       for(int k=0;k<j-1;k++)
       {
           System.out.print(j+"*");
       }
       System.out.print(j);
         System.out.println();
      
    }
    
    System.out.println("1");
   }
    }
}
