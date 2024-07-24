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

    public int climbStairsTabulation(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
