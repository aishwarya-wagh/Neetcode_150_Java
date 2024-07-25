import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequentElement {
    // https://leetcode.com/problems/top-k-frequent-elements/description/

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length+1];


        // generate hashmap
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }


        // create bucket list from hashmap
        for(Integer key: map.keySet()){
            int frequency = map.get(key);
            if(list[frequency]==null){
                list[frequency] = new ArrayList();
            }
            list[frequency].add(key);
        }

        // iterate over bucket list to get top k elements
        int[] ans = new int[k];
        int position=0;

        for(int i = list.length-1; i>=0; i--){
            if(list[i]!=null){
                for(int j=0; j<list[i].size() && position<k; j++){
                    ans[position] = list[i].get(j);
                    position++;
                }
            }

        }

        // return answer
        return ans;
    }
}
