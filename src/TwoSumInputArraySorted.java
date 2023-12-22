public class TwoSumInputArraySorted {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] res = new int[]{0,0};
        while (i != j){
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                res[0] = ++i;
                res[1] = ++j;
                break;
            } else if (sum > target){
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}

