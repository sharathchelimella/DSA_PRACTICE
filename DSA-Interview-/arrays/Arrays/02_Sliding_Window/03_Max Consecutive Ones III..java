//1004. Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int countzero = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                countzero++;
            }
            if(countzero > k){
                if(nums[left] == 0){
                    countzero--;
                }
                left++;
            }
        }
        return n-left;
        
    }
}