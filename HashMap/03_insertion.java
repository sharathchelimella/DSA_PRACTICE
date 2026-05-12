// import java.util.*;
// class Main{
//     public static void main(String[] args){
//     int[] nums = {1,2,3,5,5};
//     int[] nums1 = {1,5,2,9,3,4,6,3};
//     insertion(nums,nums1);
//     }
//     public static void insertion(int[] nums, int[] nums1){
//         HashSet<Integer> set = new HashSet<>();
//         for(int i = 0; i < nums.length; i++){
//             set.add(nums[i]);
//         }
//         int count = 0;
//         for(int j = 0; j < nums1.length; j++){
//             if(set.contains(nums1[j])){
//                 count++;
//                 set.remove(nums1[j]);
//             }
//         }
//         System.out.print(count);
//     }
// }




// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         int[] arr1 = {1,2,2,1};
//         int[] arr2 = {2,2};
//         System.out.print(Arrays.toString(insertion(arr1,arr2)));
//     }
//     public static int[] insertion(int[] arr1, int[] arr2){
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         HashSet<Integer> set = new HashSet<>();
//         int p1 = 0,p2 =0;
//         while(p1<arr1.length && p2 < arr2.length){
//             if(arr1[p1] == arr2[p2]){
//                 set.add(arr1[p1]);
//                 p1++;
//                 p2++;
//             }else if(arr1[p1] < arr2[p2]){
//                 p1++;
//             }else{
//                 p2++;
//             }
//         }
//         int[] arr = new int[set.size()];
//         int i =0;
//         for(int num:set){
//             arr[i] = num;
//             i++;
//         }
//         return arr;
        
//     }
// }



// import java.util.*;

// class Main{
//     public static void main(String[] args){
//         int[] arr1 = {1,2,2,1};
//         int[] arr2 = {2,2};
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();
        
//         for(int num : arr1){
//             set1.add(num);
//         }
//         for(int num : arr2){
//             set2.add(num);
//         }
//         set1.retainAll(set2);
        
//         int[] arr = new int[set1.size()];
//         int i =0;
//         for(int num:set1){
//             arr[i] = num;
//             i++;
//         }
//         System.out.print(Arrays.toString(arr));
        
//     }
// }



// import java.util.*;

// class Main{
//     public static void main(String[] args){
//         int[] arr1 = {1,2,2,1};
//         int[] arr2 = {2,2};
        
//         HashMap<Integer,Integer> map = new HashMap<>();
        
//         for(int num : arr1){
//             map.put(num,1);
//         }
//         List<Integer> ans = new ArrayList<>();
//         for(int num:arr2){
//             if(map.containsKey(num) && map.get(num)==1){
//                 map.put(num,0);
//                 ans.add(num);
//             }
//         }
//         int[] arr = new int[ans.size()];
//         int i = 0;
//         for(int num : arr){
//             arr[i] = num;
//             i++;
//         }
//         System.out.print(ans);
        
//     }
// }