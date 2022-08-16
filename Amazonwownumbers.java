import java.io.*;
import java.util.*;
class Solution {

    private void findCombinations(int ind,int n, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0 ){
                ans.add(new ArrayList < > (ds));
               //System.out.println(ds);
                //System.out.println(ds.size());
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind,n, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1,n, arr, target, ans, ds);
    }
    public List < List < Integer >> combinationSum(int n,int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        findCombinations(0,n, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int target = in.nextInt();
        int n=in.nextInt();
        int[] arr=new int[n];
       // int arr[] = {2};
        for(int i=0;i<n;i++)arr[i]=in.nextInt(); //give prime numbers
       
        Solution sol = new Solution();
        //sol.combinationSum(n,arr, target);
        List < List < Integer >> ls = sol.combinationSum(n,arr, target);
       // System.out.println("Combinations are: ");
       int min=300;
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                
                if(min >ls.get(i).size())
                {
                min=ls.get(i).size();
                }
               // System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
         System.out.println(min);
        
        
    }
}
