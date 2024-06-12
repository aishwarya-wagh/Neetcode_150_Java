import java.util.Arrays;

public class missingNumber {
    //https://leetcode.com/problems/missing-number/description/
    public int missingNumber(int[] nums) {
        int length= nums.length;
        int total= Arrays.stream(nums).sum();
        int expected= length*(length+1)/2;
        return expected-total;
    }

}
