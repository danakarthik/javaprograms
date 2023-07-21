import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=in.nextInt();
      }
      int xor=0;
      for(int i=0;i<n;i++)
      {
          xor^=arr[i];
      }
      System.out.println(xor);
    }
}
