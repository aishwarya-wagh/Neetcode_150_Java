package src;

public class sortColurs {
    // https://leetcode.com/problems/sort-colors/description/

    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int n:nums){
            if(n==0){
                zero++;
            }else if(n==1){
                one++;
            }else{
                two++;
            }
        }

        for(int i=0; i<zero;i++){
            nums[i]=0;
        }for(int i=zero; i<zero+one; i++){
            nums[i]=1;
        }for(int i=zero+one; i<zero+one+two; i++){
            nums[i]=2;
        }
    }
}
