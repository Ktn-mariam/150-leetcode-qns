// https://leetcode.com/problems/counting-bits/
/*
THEORY:
There is a pattern of dynamic programming
0: 0000
1: 0001
2: 0010
3: 0011
4: 0100
5: 0101
6: 0110
7: 0111
8: 1000
9: 1001
10:1010
 */

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i=1; i<=n; ++i){
            ans[i] = i%2 + ans[i/2];
        }
        return ans;
    }
}
