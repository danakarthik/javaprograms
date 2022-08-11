import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int c=0;
		HashMap<Character,Integer>hsh=new HashMap<>();
		for (int i=0;i<str.length();i++)
		{
		    if(!hsh.containsKey(str.charAt(i)))
		    {
		        hsh.put(str.charAt(i),1);
		    }
		    else{
		       hsh.put(str.charAt(i),hsh.get(str.charAt(i))+1);
		    }
		}
		//System.out.println(hsh);
		for(Map.Entry<Character,Integer>entry:hsh.entrySet())
		{
		    Character key=entry.getKey();
		    Number val=entry.getValue();
		    int value=(int)val;
		    int des=value-1;
		   
		   // System.out.println(key+" "+val);
		    if(value>1&&value%2!=0)
		    {
		        value-=des;
		    }
		    else if(value>1&&value%2==0)
		    {
		        value-=value;
		        
		    }
		     hsh.replace(key,value);
		      //System.out.println(key+" "+value);
		     
		}
		//	System.out.println(hsh);
	
		for(Map.Entry<Character,Integer>entr:hsh.entrySet())
		{
		    Character ke=entr.getKey();
		    Number va=entr.getValue();
		    int n=(int)va;
		    if(n!=0)
		    {
		          System.out.print(ke);
		    }
		    else{
		        c++;
		    }
		   
		     
		}
		if(c==hsh.size()) System.out.println("empty");
		
	}
}
