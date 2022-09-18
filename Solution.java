package text02;

import java.util.Arrays;

class Solution {
    // f(k)=f(k-1)+numSum-n*nums[n-k];
    public int maxRotateFunction(int[] nums) {
        int f = 0, n = nums.length, numSum = Arrays.stream(nums).sum();

        for (int i = 0; i < n; i++) {
            f += i * nums[i];
        }
        int res = f;
        for (int i = n - 1; i > 0; i--) {
            f += numSum - n * nums[i];
            res = Math.max(res, f);
        }
        return res;
    }


    public static void main(String[] args) {
        int []n={4,3,2,6};
        Solution solution = new Solution();
        solution.maxRotateFunction(n);

    }
}
