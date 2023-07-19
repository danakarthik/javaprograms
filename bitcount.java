import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      int bitmask=1;
      while(bitmask!=0)
      {
          int d=n&bitmask;
          if(d!=0)
          {
              count++;
          }
          bitmask=bitmask<<1;
      }
      System.out.println(count);
      
    }
}
