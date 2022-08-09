import java.util.*;

public class Main
{
	public static void main(String args[])
	{
	 Scanner in=new Scanner(System.in);
	 String  n=in.next();
	 int k=in.nextInt();
	 boolean flag=false;
	
	 HashMap<Character,Integer>hsh=new HashMap<>();
	 for(int i=0;i<n.length();i++)
	 {
	 	if(!hsh.containsKey(n.charAt(i)))
	 	{
	 		hsh.put(n.charAt(i),1);
	 	}
	 else
	 	{
	 		hsh.put(n.charAt(i),hsh.get(n.charAt(i))+1);
	 	}
	 }
	 System.out.println(hsh);
	 for(Map.Entry<Character,Integer>entry:hsh.entrySet())
	 {
	     int key=entry.getKey();
	     int value=entry.getValue();
	     if(k==value)
	     {
	         System.out.println(key);
	     }
	     else 
	     {
	         flag=true;
	     }
	 }
	 if(flag==true)
	 {
	     System.out.println("there is no element at that frequency");
	 }
	}

}
