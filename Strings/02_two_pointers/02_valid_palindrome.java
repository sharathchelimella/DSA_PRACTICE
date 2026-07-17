//125. Valid Palindrome


///Asproach 1
class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        String s2 = "";

        for(int i = s.length()-1; i >= 0; i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1 += Character.toLowerCase(s.charAt(i));
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s2 += Character.toLowerCase(s.charAt(i));
            }
        }
        if(s1.equalsIgnoreCase(s2)){
            return true;
        }else{
            return false;
        }
    }
}


//Aproach 2
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right &&  !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right &&  !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}