package src;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    // https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            int start = nums[i];
            while(i+1< nums.length && nums[i]+1== nums[i+1])
                i++;

            if(start!=nums[i]){
                result.add(""+start+"->"+nums[i]);
            }else{
                result.add(""+start);
            }

        }


        return result;

    }
}
