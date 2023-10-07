import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
        int[] nums = {0,0,1,1,1,2,20,3,3,4};
        int[] n = sort(nums);
        int[] n1 = duplicate(n);
        for (int i :n1) {
            System.out.print(i + " ");
        }
    }
    public static int[] duplicate(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == arr[i]){
                arr[i] = 69;
            }
        }
        return arr;
    }
    public static int[] sort(int[] arr){
        boolean swapped;
        do{
            swapped = false;
        for (int i = 1;i<arr.length ;i++){
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
        }
        }while (swapped);
        return arr;
    }
}