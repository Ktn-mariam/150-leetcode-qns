/*
Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
Theory:
    1. Initialise a var maxElement with -1
    2. Loop from the right
    3. First index from left will be -1
    4. Then compare this element and maxElement to get the maxVal
    5. And continue so on...
 */

public class ReplaceElementsWithGreatestElement {
    public int[] replaceElements(int[] arr) {
        int maxElement = -1;
        for (int i=arr.length-1; i>=0; i--) {
            int val = arr[i];
            arr[i] = maxElement;
            if (val > maxElement){
                maxElement = val;
            }
        }
        return arr;
    }
}
