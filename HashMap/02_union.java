import java.util.*;
class Main{
    public static void main(String[] args){
    int[] nums = {1,2,3,5,5};
    int[] nums2 = {1,5,2,9,3,4,6,3};
    majorityelements(nums,nums2);
    }
    public static void majorityelements(int[] nums, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        for(int j = 0; j < nums2.length; j++){
            set.add(nums2[j]);
        }
        
        System.out.print(set.size());
        
        
    }
}
