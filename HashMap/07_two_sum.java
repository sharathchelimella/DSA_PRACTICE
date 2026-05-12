// import java.util.*;

// class Main{
//     public static void main(String[] args){
//         int[] arr = {2,7,6,8,9};
//         int target = 9;
//         System.out.print(Arrays.toString(twosum(arr,target)));
//     }
//     public static int[] twosum(int[] arr,int target){
//         int n = arr.length;
//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j < n; j++){
//                 if(arr[i]+arr[j]==target){
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[] {-1,-1};
//     }
// }



//when it is sorted array
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         int[] arr = {2,7,8,8,9};
//         int target = 9;
//         System.out.print(Arrays.toString(twosum(arr,target)));
//     }
//     public static int[] twosum(int[] arr,int target){
//         int n = arr.length;
//         int i = 0;
//         int j = n-1;
//         while(i<j){
//             int sum = arr[i] + arr[j];
//             if(sum == target){
//                 return new int[] {i,j};
//             }else if(sum<target){
//                 i++;
//             }else{
//                 j--;
//             }
//         }
//         return new int[] {-1,-1};
//     }
// }


//using Hash Map

// import java.util.*;

// class Main{
//     public static void main(String[] args){
//         int[] arr = {2,7,8,8,9};
//         int target = 9;
//         System.out.print(Arrays.toString(twosum(arr,target)));
//     }
//     public static int[] twosum(int[] arr,int target){
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i  = 0; i < arr.length-1; i++){
//             map.put(arr[i],i);
//         }
//         for(int i = 0; i < arr.length-1; i++){
//             int remain = target- arr[i];
//             if(map.containsKey(remain) && map.get(remain) != i){
//                 return new int[] {i, map.get(remain)};
//             }
//         }
//         return new int[] {-1,-1};
        
//     }
// }