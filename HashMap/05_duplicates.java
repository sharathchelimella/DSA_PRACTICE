//

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(hash.containsKey(nums[i])){
                return true;
            }else{
                hash.put(nums[i],1);
            }   
        }
        return false;
        
    }
}