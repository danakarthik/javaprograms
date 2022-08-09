import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int x=in.nextInt();
	    int[] arr=new int[n];
	    boolean flag=false;
	    for(int i=0;i<n;i++)arr[i]=in.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>=x)
	        {
	            System.out.println(arr[i]);
	        }
	        else flag=true;
	    }
	    if(flag==true)System.out.println("1");
		
	}
}
