//344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char empt = s[left];
            s[left] = s[right];
            s[right] = empt;
            left++;
            right--;
        }
        
    }
}