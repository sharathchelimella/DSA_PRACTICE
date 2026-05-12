// import java.util.*;
// class Main{
    
//     public  static int sumofSquareofDigit(int n){
//         int sum = 0;
//         while(n !=0){
//             int ls = n%10;
//             n = n/10;
//             sum = sum+(ls*ls);
//         }
//         return sum;
//     }
    
//     public static boolean HappyNumb(int n){
//         HashSet<Integer> set = new HashSet<>();
//         while(n != 1){
//             if(set.contains(n)){
//                 return false;
//             }
//             set.add(n);
//             n = sumofSquareofDigit(n);
//         }
//         return true;
//     }
    
//     public static void main(String[] args){
//         int n = 19;
//         System.out.print(HappyNumb(n));
//     }
// }







import java.util.*;

class Main {

    public static int sumofSquareofDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int ls = n % 10;
            n = n / 10;
            sum = sum + (ls * ls);
        }
        return sum;
    }

    public static boolean HappyNumb(int n) {

        int sl = n;
        int fs = n;

        while (true) {
            sl = sumofSquareofDigit(sl);
            fs = sumofSquareofDigit(sumofSquareofDigit(fs));
            if (fs == 1) {
                return true;
            }
            if (sl == fs) {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        int n = 19;

        System.out.print(HappyNumb(n));
    }
}