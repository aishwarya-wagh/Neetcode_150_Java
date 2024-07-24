public class isSubsequence {
    // https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150

    public static void main(String args[]){
        String s1 ="abc";
        String s2="adfsbdsfdc";
        boolean result = isSubsequence(s1,s2);
        System.out.println(result);
    }
    public static boolean isSubsequence(String s, String t) {

        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();

    }
}
