import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
// https://leetcode.com/problems/group-anagrams/
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        String key;

        for(String st: strs){
            char[] arr =st.toCharArray();
            Arrays.sort(arr);
            key= Arrays.toString(arr);
            List<String>  lst = new ArrayList<>();
            if(map.containsKey(key)){
                for(String s:map.get(key))
                    lst.add(s);
            }
            lst.add(st);
            map.put(key,lst);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> s:map.values()){
            result.add(s);
        }
        return result;

    }
}
