package Strings;
import java.util.*;
public class Q36_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            java.util.Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(s);
        System.out.println(ans);

    }
}
