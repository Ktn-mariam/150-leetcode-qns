/*
Link: https://leetcode.com/problems/group-anagrams/
Complexity: O(N * K * log(K))
            N: Size of strs
            K: max length of word
            K * Log K: sorting the word
Theory:
    1. Create a hashmap
    2. It will contain key with the sorted version of the strings
    3. Value will be the list of actual strings
    4. Iterate through each of the strings in the array
    5. Convert the word to char array
    6. Sort the array
    7. Convert it back to string
    8. Check if hashmap contains such a key, if not create such a key with an empty list of arraylist
    9. Then add the word to the arraylist corresponding to the key
    10. return the hm collection by converting it to list
 */



import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<String>());
            }
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}

/*
NEW SYNTAX LEARNT:
    1. String s = new String(char[] c): converting a character array to string
    2. Arrays.sort(c): sorts the array without having to return it
    3. hm.containsKey(key): to check if it contains the key
    4. new ArrayList<>(hm.values()): hashmap.values() returns a collection
                                     and this syntax can be used to covert the collection to arraylist
 */