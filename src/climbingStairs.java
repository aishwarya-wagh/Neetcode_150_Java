package src;

public class climbingStairs {
    //https://leetcode.com/problems/climbing-stairs/description/

    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }


}
