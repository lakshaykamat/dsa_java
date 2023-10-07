public class Main {
    public static void main(String[] args) {
        int[] nums = {3,3,5,23,1};
        int target = 6;
       int[] result = twoSum(nums,target);
       printArray(result);
    }
    public static int[] twoSum(int[] array,int target){
        int length = array.length;
        for(int i=0;i<length-1;i++){
            for(int j = i+1;j<length;j++){
                if(array[j] + array[i] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void printArray(int[] array){
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}