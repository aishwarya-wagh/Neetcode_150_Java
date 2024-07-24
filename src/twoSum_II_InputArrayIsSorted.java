package src;

public class twoSum_II_InputArrayIsSorted {
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

    public static void main(String args[]){
        int[] arr = new int[] {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        for(int n: result){
            System.out.println(n);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;

        while(right>left){
            if(target== numbers[left]+numbers[right]){
                return new int[]{left+1,right+1};
            } else if(target > numbers[left]+numbers[right]){
                left++;
            }else if(target < numbers[left]+numbers[right]){
                right--;
            }
        }

        return null;

    }
}
