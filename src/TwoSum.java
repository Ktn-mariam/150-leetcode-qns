import java.util.*;
/*
LINK: https://leetcode.com/problems/two-sum/
THEORY:
    1-Create a hashMap
    2-Iterate through the number array
    3-Before adding the number to the HashMap
      Check if target - number is present in the HashMap
      If its present then the result is the number and target-number
    4-Else add it to the hashMap
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int search = target - nums[i];
            if (hm.containsKey(search)){
                return new int[]{hm.get(search), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}

/*
NEW SYNTAX:
    1-To create a hashMap: HashMap<Integer, Integer> hm = new HashMap<>()
    2-To check if it contains a key: hm.containsKey(key)
    3-To get a value from hm through key: hm.get(key)
    4-To add a key-value pair: hm.put(key, value)
 */
