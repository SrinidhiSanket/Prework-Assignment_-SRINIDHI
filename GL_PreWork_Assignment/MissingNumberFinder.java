import java.util.Scanner;

public class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
        arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
        in.close();
        }
        
        static int missingNumberFinder(int array[], int n) {
        // write your code here
        n = array.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
          sum-=array[i];
        return sum;

        }
       
}
