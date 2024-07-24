public class validPalindrome {
    //https://leetcode.com/problems/valid-palindrome/description/

    public boolean isPalindrome(String s) {
        boolean result=true;
        if(s.trim()==""){
            return result;
        }else
        {
            char[] arr = s.toCharArray();
            int left=0;
            int right = arr.length-1;
            while(right>=left){
                while(!Character.isLetterOrDigit(arr[left])){
                    left++;
                }while(!Character.isLetterOrDigit(arr[right])){
                    right--;
                }
                if(Character.toLowerCase(arr[left])!=Character.toLowerCase(arr[right])){
                    return false;
                }else{
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
