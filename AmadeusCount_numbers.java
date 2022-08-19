import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); //size of an array
        int t=in.nextInt();//no of testcases
       
        int[] arr=new int[n];
        
        int c=0; 
       // ArrayList<Integer>arr=new ArrayList<>();
       HashMap<Integer,Integer>hsh=new HashMap<>();
     while(t-->0){
        
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
         int tar=in.nextInt(); //target key to find in the array
        for(int i=0;i<n;i++)
        {
            if(!hsh.containsKey(arr[i]))
            {
                hsh.put(arr[i],1);
            }
            else
            {
                hsh.put(arr[i],hsh.get(arr[i])+1);
            }
        }
       // System.out.println(hsh);
        for(Map.Entry<Integer,Integer>entry:hsh.entrySet())
        {
            Integer key=entry.getKey();
            Integer vaue=entry.getValue();
            if(tar==key)
            {
                System.out.println(vaue);
            }
            else{
                c++;
            }
         }
         if(c==arr.length)System.out.println(c);
     
     }
        
    }
}
