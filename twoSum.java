public class twoSum {
    // https://leetcode.com/problems/two-sum/submissions/1270581645/

    public int[] twoSum1(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            for(int j=i+1; j< nums.length; j++){
                if(nums[j]== target-temp){
                    return new int[]{i,j};
                }
            }
        }
        return answer;
    }

    // 0 (n^2) //quadratic complexity worst solution

    // review following
    public int[] twoSum(int[] nums, int target) {
        int target0;
        int targetN;
        int length= nums.length-1;

        for(int i=0;i<=length;i++){
            target0=target-nums[i];
            targetN=target-nums[length-i];
            for(int j=i+1; j<=length; j++){
                if(nums[j]==target0){
                    return new int[]{i,j};
                }else if(nums[j]==targetN){
                    return new int[]{length-i,j};
                }
            }
        }
        return null;
    }

}
