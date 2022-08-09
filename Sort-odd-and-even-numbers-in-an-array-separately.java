import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[]  arr=new int[n];
        //int[] even=new int[n];
        //int[] odd=new int[n];
        ArrayList<Integer> odd=new ArrayList<>();
      ArrayList<Integer> even=new ArrayList<>();
        //int[] result=new int[n];
         ArrayList<Integer> result=new ArrayList<>();
        int c=0;
        int d=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                //even[c]=arr[i];
                even.add(arr[i]);
                //c++;
            }
            else
            { 
                //if(arr[i]==0)continue;
                //odd[d]=arr[i];
                //d++;
                odd.add(arr[i]);
            }
        }
       // Arrays.sort(even);
        //Arrays.sort(odd);
         Collections.sort(even);
          Collections.sort(odd);
        int e=0;
        int MAX=even.size()-1;
         //System.out.println(Arrays.toString(even));
          //System.out.println(Arrays.toString(odd));
           //System.out.println(Arrays.toString(odd));
          for(int i=0;i<n;i++)
          {
              if(arr[i]%2==0)
              {
                  result.add(even.get(MAX));
                  MAX--;
              }
              else
              {
                  result.add(odd.get(e));
                  e++;
              }
          }
         
          System.out.println(result);
        

     
    }
}
