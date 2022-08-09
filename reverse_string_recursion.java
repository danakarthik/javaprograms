import java.util.*;
public class Main
{
    static boolean reverse(int i,char[] arr,int n )
    {
        if(i>=n/2) return true;
        
            if(arr[i]!=arr[n-i-1])
            return false;
    
        return reverse(i+1,arr,n);
        
        
    }
 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	String str=in.next();
		char arr[]=new char[str.length()];
		for(int i=0;i<str.length();i++)arr[i]=str.charAt(i);
		//reverse(0,arr,n);
		System.out.println(	reverse(0,arr,str.length()));
	}
}
