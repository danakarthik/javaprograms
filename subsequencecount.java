import java.util.*;
public class Main
{
    static int subsequence(int i,List<Integer>Arr,int s,int[] arr,int n,int sum)
    {
        int c=0;
        if(i==n)
        {
            
            if(s==sum) return 1;
           return 0;
        }
        Arr.add(arr[i]);
        s+=arr[i];
        int l=subsequence(i+1,Arr,s,arr,n,sum);
          s-=arr[i];
        Arr.remove(Arr.size()-1);
      
        int r=subsequence(i+1,Arr,s,arr,n,sum);
        return l+r;
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
	System.out.println(subsequence(0,Arr,0,arr,n,s));
	
		//System.out.println(	reverse(0,arr,str.length()));
	}
}
