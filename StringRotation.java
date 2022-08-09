import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	 String  n=in.nextLine();
	 int k=in.nextInt();
	
		int c=rotatedWords(n,k);
		System.out.println(c);
	}


public static int rotatedWords(String input1, int input2) {
    int count = 0;
    String arr[] = input1.split(" ");
    System.out.println(Arrays.toString(arr));
    if (input1 != null && !input1.isEmpty()) {
        for (int i = 0; i < arr.length; i++) {
            String s1 = arr[i] + arr[i];
            //System.out.println(arr[i]);
            int start = arr[i].length() - input2;

            //System.out.println("arr[i] : " + arr[i]);
            String s2 = s1.substring(start, start + arr[i].length());
            //System.out.println("s2 : " + s2);
            if (s2.equalsIgnoreCase(arr[i])) {
                count++;
            }
        }
    }
    return count;
}
}
