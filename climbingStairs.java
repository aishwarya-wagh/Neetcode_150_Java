import java.util.HashMap;
import java.util.Map;

public class climbingStairs {
    //https://leetcode.com/problems/climbing-stairs/description/

    public int climbStairsRecursion(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return climbStairsRecursion(n-1) + climbStairsRecursion(n-2);
    }

    public int climbStairsMemorization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsMemorization(n, memo);
    }

    private int climbStairsMemorization(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairsMemorization(n-1, memo) + climbStairsMemorization(n-2, memo));
        }
        return memo.get(n);
    }
}
