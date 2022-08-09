import java.util.*;
public class Main
{
    static boolean subsequence(int i,List<Integer>Arr,int s,int[] arr,int n,int sum)
    {
        if(i==n)
        {
            
            if(s==sum)
            {
                System.out.println(Arr);
            return true;
            }
            return false;
        }
        Arr.add(arr[i]);
        s+=arr[i];
        if(subsequence(i+1,Arr,s,arr,n,sum)==true) return true;
          s-=arr[i];
        Arr.remove(Arr.size()-1);
      
        if(subsequence(i+1,Arr,s,arr,n,sum)==true) return true;
        return false;
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
