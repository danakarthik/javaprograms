import java.util.*;

public class Main
{
	public static void main(String args[])
	{
	 Scanner in=new Scanner(System.in);
	 	 int n=2;
	 	  int k=10;
	  
	 while(n<k)
	 {
	     boolean f=true;
	
	 	for(int j=2;j<n;j++)
	 	{
	 		if(n%j==0)
	 		{
	 			f=false;
	 			break;
	 		}
	 	}
	 	if(f==true)System.out.println(n+"is a prime");
	 	//else System.out.println(n+"is not a prime");
	 	++n;
	  }

	 	
	
}
}
