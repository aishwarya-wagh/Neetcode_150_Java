
// https://leetcode.com/problems/majority-element/
public class majorityElement {
    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int n:nums){
            if(count==0){
                candidate=n;
            }if(candidate==n){
                count++;
            }else{
                count--;
            }
        }
        return candidate;

    }
public static void main(String[] args){
        int[] input ={1,2,1,1,2,2,2};
    System.out.println("majorityElement : "+majorityElement(input));
}

}


//https://leetcode.com/problems/valid-anagram/solutions/3687854/3-method-s-c-java-python-beginner-friendly/
//https://leetcode.com/problems/contains-duplicate/description/