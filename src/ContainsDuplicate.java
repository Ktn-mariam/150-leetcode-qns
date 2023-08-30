import java.util.*;
// LINK: https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    // O(n log n) Sort and find if 2 neighbours are the same
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    // O(n) Create a hashset
    //      loop through the array and
    //      add element if it isnt in the hashset
    //      or return true if its already present in the hashset indicating duplicate
    public boolean hashsetSol(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums){
            if (hs.contains(num)) return true;
            hs.add(num);
        }
        return false;
    }

    // Create a hashmap with key as the num and value as its count
    // Return true if key exists and value = 1
    public boolean hashMap(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums){
            if (hm.containsKey(num) && hm.get(num) >= 1) return true;
            hm.put(num, 1);
        }
        return false;
    }
}
