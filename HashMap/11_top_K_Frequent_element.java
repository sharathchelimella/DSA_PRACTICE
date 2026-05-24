//347. Top K Frequent Elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)  -> map.get(a)-map.get(b));

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1); 
        }
        for(int num : map.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] arr = new int[k];
        for(int i = 0; i < k;i++){
            arr[i] = heap.poll();
        }
        return arr;
    }
}