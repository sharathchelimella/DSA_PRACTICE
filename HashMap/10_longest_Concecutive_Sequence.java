class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map  = new HashMap<>();
        for(int num:nums){
            map.put(num,false);
        }
        int n = nums.length;
        
        int max = 0;
        for(int i = 0; i < n; i++){
            int NextKey = nums[i]+1;
            int count = 1;
            while(map.containsKey(NextKey) && map.get(NextKey) == false){
                map.put(NextKey, true);
                NextKey++;
                count++;
            }
            int prevKey = nums[i]-1;
            while(map.containsKey(prevKey) && map.get(prevKey) == false){
                map.put(prevKey, true);
                prevKey--;
                count++;
            }
            max = Math.max(max , count);
        }
        return max;
    }
}