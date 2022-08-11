
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    int s=0;
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)arr[i]=in.nextInt();
	HashSet<Integer>se=new HashSet<>();
	
	for(int i=0;i<n;i++)
	{
	    if(i<n-1&&arr[i]>arr[i+1])
	    {
	        continue;
	    }
	    else{
	        se.add(arr[i]);
	        
	    }
	}
	for(Number a:se)
	{
	    s=s+(int)a;
	}
	System.out.println(s);
	}
}
