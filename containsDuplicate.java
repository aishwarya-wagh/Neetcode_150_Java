import java.util.HashSet;

public class containsDuplicate {

    //https://leetcode.com/problems/contains-duplicate/



    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int n : nums){
            if(seen.contains(n)){
                return true;
            }seen.add(n);
        }
        return false;

    }
}
