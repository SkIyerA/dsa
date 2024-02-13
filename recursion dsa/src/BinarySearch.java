public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target=3;
        System.out.println("The target element is at "+ B_search(arr,target,0,arr.length-1)+"th position");

    }

    /*static int B_search(int[] arr, int target,int start,int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid+1;
        }
        if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        return B_search(arr, target, start, end);
    }*/

    static int B_search(int[] arr, int target,int start,int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid+1;
        }
        if (arr[mid] < target) {
            return B_search(arr,target,mid+1,end);
        }

        return B_search(arr, target, start, mid-1);
    }
}
