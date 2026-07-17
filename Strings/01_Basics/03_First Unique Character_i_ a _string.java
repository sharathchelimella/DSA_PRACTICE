
//387. First Unique Character in a String


//Aproach 1

class Solution {
    public int firstUniqChar(String s) {
       for(int i = 0; i < s.length(); i++){
        int count = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
        }
        if(count == 1){
            return i;
        }
       }return -1;  
    }
}

//Aproach 2

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){   
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
}