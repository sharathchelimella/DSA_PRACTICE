class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;

        String ans  = "";
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                counter--;
            }

            if(counter > 0){
                ans += ch;
            }
            if(ch == '('){
                counter++;
            }
        }
        return ans;
        
    }
}