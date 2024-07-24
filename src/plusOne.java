package src;

public class plusOne {
    // https://leetcode.com/problems/plus-one/description/

    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        for(int i=last; i>=0; i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;

        }
        digits = new int[digits.length+1];

        digits[0] =1;
        return digits;

    }

}
