import java.util.Arrays;

public class validAnagram {

    // https://leetcode.com/problems/valid-anagram/

    public boolean isAnagramSolution1(String s, String t) {
        if(s.length()== t.length()){
            char[] arr_s = s.toCharArray();
            char[] arr_t = t.toCharArray();

            Arrays.sort(arr_s); // complexity O(n log n)
            Arrays.sort(arr_t); // complexity O(n log n)

            return Arrays.equals(arr_s,arr_t); // O (n)
            // total complexity O(n log n) + O(n)
            // == O(n log n)


        }
        return false;
    }


    public boolean isAnagram3(String s, String t) {
        int arr[] =new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c : t.toCharArray()){
            arr[c-'a']--;
        }
        for(int i :arr){
            if(i!=0)
                return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if(s.length()== t.length()){
            int[] arr = new int[26];
            char[] sArr = s.toCharArray();
            char[] tArr =t.toCharArray();
            for(int i=0; i< sArr.length; i++){
                arr[sArr[i]-'a']++;
                arr[tArr[i]-'a']--;
            }
            for(int i=0; i< arr.length; i++){
                if(arr[i]!=0){
                    return false;
                }
            }
            return true;

        }
        return false;
    }
}
