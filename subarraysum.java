import java.util.*;
public class Main
{
    static void subsequence(int i,List<Integer>Arr,int s,int[] arr,int n,int sum)
    {
        if(i==n)
        {
            
            if(s==sum)System.out.println(Arr);
            return;
        }
        Arr.add(arr[i]);
        s+=arr[i];
        subsequence(i+1,Arr,s,arr,n,sum);
          s-=arr[i];
        Arr.remove(Arr.size()-1);
      
        subsequence(i+1,Arr,s,arr,n,sum);
    }
 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	//String str=in.next();
	int n=in.nextInt();
	int s=in.nextInt();
	int[] arr=new int[n];
//	int[] arr={1,2,1};
	
	for(int i=0;i<n;i++)arr[i]=in.nextInt();
	List<Integer> Arr=new ArrayList<Integer>();
	subsequence(0,Arr,0,arr,n,s);
	
		//System.out.println(	reverse(0,arr,str.length()));
	}
}
