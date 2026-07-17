//1749  maximum absolute sum of arraya

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int current_sum = 0;
        int max = 0;
        int min = 0;
        int current_max = 0;
        int current_min = 0;


        for(int i = 0; i < nums.length; i++){
            current_max=Math.max(current_max+nums[i],nums[i]);
            current_min = Math.min(current_min+nums[i],nums[i]);
            
            max = Math.max(current_max,max);
            min = Math.min(current_min,min);

        }
        return Math.max(Math.abs(min),max);
        
    }
}
