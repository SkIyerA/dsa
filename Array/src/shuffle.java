import java.util.Arrays;
import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Enter the elements in Ascending Order");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target to be found");
        int target = in.nextInt();
        int[] ans =new int[2*n];
        ans=shuffle(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] arr, int n){
        int[] ans= new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                ans[i]=arr[i/2];
            }else{
                ans[i]=arr[n+i/2];
                }

        }
        return ans;
    }
}
