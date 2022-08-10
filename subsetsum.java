import java.util.*;
public class Main
{
    static void subsequence(int i,List<Integer>Arr,int[] arr,int n )
    {
        if(i==n)
        {
             int sum=0;
            //System.out.println(Arr);
            for (int j : Arr){
               sum = sum + j;}
               System.out.print(sum+" ");
            return;
        }
        Arr.add(arr[i]);
        subsequence(i+1,Arr,arr,n);
        Arr.remove(Arr.size()-1);
        subsequence(i+1,Arr,arr,n);
    }
 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	//String str=in.next();
	int n=in.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)arr[i]=in.nextInt();
	List<Integer> Arr=new ArrayList<Integer>();
	subsequence(0,Arr,arr,n);
	
		//System.out.println(	reverse(0,arr,str.length()));
	}
}
