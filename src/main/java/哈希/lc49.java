package 哈希;

import java.util.*;

public class lc49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                List<String> curr =  map.get(key);
                curr.add(s);
                map.put(key,curr);
            }else{
                List<String> curr = new ArrayList<>();
                curr.add(s);
                map.put(key,curr);
            }
        }
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            String key = entry.getKey();
            List<String> value = entry.getValue();
            res.add(value);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"",""};
        List<List<String>> a  = groupAnagrams(strs);
        System.out.println(a);
    }

}
