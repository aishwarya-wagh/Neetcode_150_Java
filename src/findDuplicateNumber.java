package src;

import java.util.Arrays;
import java.util.HashSet;

public class findDuplicateNumber {

    // https://leetcode.com/problems/find-the-duplicate-number/


    public int findDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

        public int findDuplicate2(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();
            for(int i = 0; i< nums.length; i++){
                if(!hs.contains(nums[i])){
                    hs.add(nums[i]);
                }else{
                    return nums[i];
                }
            }
            return 0;
        }

        // review following
    public int findDuplicate3(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int i=0; i<nums.length; i++){
            if(arr[nums[i]]){
                return nums[i];
            }else{
                arr[nums[i]]=true;
            }
        }
        return -1;
    }

}
