import java.util.*;

// LINK: https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public boolean sorting(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public boolean hashMap(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char x : s.toCharArray()) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (char c: t.toCharArray()){
            if (hm.containsKey(c)){
                hm.put(c, hm.get(c) -1);
            }else {
                return false;
            }
        }
        for (int i: hm.values()){
            if (i !=0) return false;
        }
        return true;
    }

    public boolean CountSort(String s, String t) {
        int[] count = new int[26];

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

}

/*
NEW SYNTAX
    1-To sort array: Arrays.sort(nums);
    2-To create hashset: HashSet<Integer> hs = new HashSet<>();
    3-To create hashmap: HashMap<Character, Integer> hm = new HashMap<>();
            hm.put(c, number)
            hm.contains(c)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
 */