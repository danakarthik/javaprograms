import java.util.*;
public class Main
{
    public static void 	combination(int ind,Set<List<Integer>>brr,List<Integer>Arr,int[] arr,int tar)
    {
       
        if(tar==0)
        {
            brr.add(new ArrayList<>(Arr));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(arr[i]>tar &&arr[i]==arr[i-1])continue;
            if(arr[i]>tar)break;
            Arr.add(arr[i]);
            combination(i+1,brr,Arr,arr,tar-arr[i]);
            Arr.remove(Arr.size()-1);
            
        }
        
        
    }
    public static Set<List<Integer>>comabi(int[] can,int target)
    {
         Set<List<Integer>>ans=new HashSet<>();
         Arrays.sort(can);
         	combination(0,ans,new ArrayList<>(),can,target);
         return ans;
        
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int tar=in.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)arr[i]=in.nextInt();
	//int[] arr={5,1,4,1};
	
	System.out.println(comabi(arr,tar));
	
	

	
	}
}
