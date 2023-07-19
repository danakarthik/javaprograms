import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=n-1;
      if((n & k)==0)
      {
          System.out.println(n+ " number is a power of 2 ");
      }
      else
      {
         System.out.println(n+ " number is not a power of 2 "); 
      }
    }
}
