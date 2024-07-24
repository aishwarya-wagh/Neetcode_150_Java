package src;

import java.util.HashMap;

public class wordPattern {

    // https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150

    public static void main(String args[]){
        String s1="abca";
        String s2="aword bword cword aword";
        boolean result =wordPattern(s1,s2);
        System.out.println(result);
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }
}
