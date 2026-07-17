//238  Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n  = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for(int i = 1; i < n; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int right_prod = 1;
        for(int r = n-1; r >=0; r--){
            res[r] = right_prod*res[r];
            right_prod = right_prod*nums[r];
        }
        return res;
    }
}