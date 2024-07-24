package src;

public class ransomNote {
    // https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] arr = new int[26];
        for(char ch: magazine.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch: ransomNote.toCharArray()){
            if(arr[ch-'a']==0) return false;
            arr[ch-'a']--;
        }

        return true;
    }
}
