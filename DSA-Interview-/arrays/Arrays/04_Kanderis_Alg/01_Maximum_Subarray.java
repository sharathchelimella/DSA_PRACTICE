//53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int current_sum = 0;
        int max = nums[0];
        for(int i = 0; i < n; i++){
            current_sum += nums[i];
            max = Math.max(max,current_sum);
            if(current_sum < 0){
                current_sum = 0;
            }
        }
        return max;
        
    }
}