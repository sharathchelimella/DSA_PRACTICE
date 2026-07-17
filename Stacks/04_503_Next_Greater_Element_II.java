// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.


class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        int n = nums.length;
        for(int i = n*2-1; i >= 0; i--){
            int num = nums[i%n];
            while(!stack.isEmpty() && num >= stack.peek()){
                stack.pop();
            }

            if(!stack.isEmpty() && i<n){
                res[i] = stack.peek();
            }
            stack.push(num);
        }
        return res;
    }
}