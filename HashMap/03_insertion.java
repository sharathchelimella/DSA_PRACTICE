import java.util.*;
class Main{
    public static void main(String[] args){
    int[] nums = {1,2,3,5,5};
    int[] nums1 = {1,5,2,9,3,4,6,3};
    insertion(nums,nums1);
    }
    public static void insertion(int[] nums, int[] nums1){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int count = 0;
        for(int j = 0; j < nums1.length; j++){
            if(set.contains(nums1[j])){
                count++;
                set.remove(nums1[j]);
            }
        }
        System.out.print(count);
        
    }
}
