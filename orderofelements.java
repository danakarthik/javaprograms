import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] brr=new int[200];
        int[] c=new int[n];
        int[] arr=new int[n];
        int []dum=new int[n];
        for(int i=0;i<n;i++)
        {arr[i]=in.nextInt();
            dum[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(dum);
     
       
        int i=0;
       for(int j=0;j<n;j++)brr[j]=j;   
         int z=0;
        
         for(int k=0;k<n;k++)
         {
             for(int l=0;l<n;l++)
             {
                 if(dum[k]==arr[l]){
                     c[l]=brr[z];
                     z++;
                 }
             }
         }
         System.out.println(Arrays.toString(c));
        
        
    }
}
