package ArrayRecurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element");
        int target = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();


        System.out.println(TargetSearch(arr,target)); //to check if the target element is present
        System.out.println(IndexSearch(arr,target));  //to return the index where the element is present
        System.out.println(IndexFromLast(arr,target,arr.length-1));  //to return the index where the element in present but search from last index
        ListOfIndex(arr,target,0);  //to return a list of index where the target element is present. Occurrence of target more than once
        System.out.println(indexList);
        System.out.println(ListList(arr,target,0,list));

        /*to return the list a)not taking the list in the argument b) create the list in the body of the function itself
        Challenges
        a) in each function call, a new empty list is created(diff object for diff fxn call)-> find a way to pass the data of the function calls above
                whenever returning values from the below that is last function call, check at each step if any answer of that function call if present is to be added as well.

         */
        System.out.println(WithoutListArg(arr,target,0));
    }

    public static ArrayList<Integer> WithoutListArg(int[] arr, int target, int index){
        ArrayList <Integer> list = new ArrayList<>(); //creating new array list in each function call
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);   //will contain answer for that particular function call only

        }
        ArrayList<Integer> AnsBeforeCalls= WithoutListArg(arr,target,index+1);
        list.addAll(AnsBeforeCalls);
        return list;
    }


        public static ArrayList<Integer> ListList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return ListList(arr,target,index+1,list); //list, though at each recursion call the reference variable is different all the lists, point to the same object
    }
    static ArrayList<Integer>  indexList = new ArrayList<>();
    public static void ListOfIndex(int[] arr,int target, int index){

        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            indexList.add(index);
        }
        ListOfIndex(arr,target,index+1);

    }

    public static int IndexFromLast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return IndexFromLast(arr, target, index - 1);
        }
    }

    public static int IndexSearch(int[] arr, int target){
        return IndexHelper(arr, target, 0);
    }

    public static int IndexHelper(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return IndexHelper(arr, target, index + 1);
        }
    }

    public static boolean TargetSearch(int[] arr, int target){
        return Helper(arr, target,0);
    }

    /*public static  boolean Helper(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        if(target==arr[index]){
            return true;
        }
        return Helper(arr,target,index+1);


    }*/

    public static  boolean Helper(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || Helper(arr,target, index+1);

    }
}
