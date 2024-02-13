import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Enter the elements in Ascending Order");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Sums(arr,0,0);
        System.out.println(arr);

    }

    public static void Sums(int[] arr,int start,int ans){
        if(start<arr.length){
            int sum=0;
            while(start>=0){
                sum=sum+arr[start];
                start--;
            }
            Sums(arr,start+1,ans+1);
            arr[ans]=sum;
        }
    }
}
