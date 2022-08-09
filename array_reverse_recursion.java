import java.util.*;
public class Main
{
    static void reverse(int i,int[] arr,int n )
    {
        //int n=arr.length;
        if(i>=arr.length/2)
        return;
        //swap(arr[i],arr[n-i-1]);
        arr[i]=arr[i]^arr[n-i-1];
        arr[n-i-1]=arr[i]^arr[n-i-1];
        arr[i]=arr[i]^arr[n-i-1];
        reverse(i+1,arr,n);
        
        
    }
   /* static int swap(int a,int b)
    {
    
        a=a^b;
        b=a^b;
        a=a^b;
        return a,b;
    }*/
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=in.nextInt();
		reverse(0,arr,n);
		System.out.println(Arrays.toString(arr));
	}
}
