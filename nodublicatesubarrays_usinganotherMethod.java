import java.util.*;
public class Main
{
    static void subsequence(int ind,List<Integer>Arr,List<List<Integer>>s,int[] arr,int n )
    {
      
           s.add(new ArrayList<>(Arr));
           for(int i=ind;i<arr.length;i++)
           {
               if(arr[i]==arr[i]&&i!=ind)continue;
                 Arr.add(arr[i]);
                subsequence(i+1,Arr,s,arr,n);
               Arr.remove(Arr.size()-1);
               
           }
          
      
        
    }
 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	//String str=in.next();
	int n=in.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)arr[i]=in.nextInt();
	List<Integer> Arr=new ArrayList<Integer>();
	//Set<List<Integer>>s=new HashSet<Integer>();
	  List<List<Integer>>s=new ArrayList<>();
	subsequence(0,Arr,s,arr,n);
	System.out.println(s);
	
		//System.out.println(	reverse(0,arr,str.length()));
	}
}
