
//151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        String[] s2 = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = s2.length-1; i >= 0; i--){
            result.append(s2[i]);
            if(i != 0){
                result.append(" ");
            }
            
        }
        return result.toString();
    }
}