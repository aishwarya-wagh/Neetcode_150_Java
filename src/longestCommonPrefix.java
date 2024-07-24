package src;

import java.util.Arrays;

public class longestCommonPrefix {
    // https://leetcode.com/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int length = Math.min(first.length(),last.length());
        for(int i =0;  i< length; i++){
            if (first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();

    }
}
