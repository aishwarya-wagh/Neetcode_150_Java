package src;

public class noOf1Bits {
    //https://leetcode.com/problems/number-of-1-bits/description/
    public int hammingWeight(int n) {
        int total=0;
        int mask=1;

        for(int i=0;i<=32;i++){
            total= total+ ((n & mask)==0 ? 0:1);
            mask<<=1;

        }
        return total;
    }
}
