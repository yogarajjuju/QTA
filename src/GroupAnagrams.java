import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {

            char ch[] = word.toCharArray();

            Arrays.sort(ch);

            String sorted = new String(ch);

            map.putIfAbsent(sorted, new ArrayList<>());

            map.get(sorted).add(word);
        }

        System.out.println(map.values());
    }
}