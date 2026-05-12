import java.util.*;
class Main {
    public static boolean isometric(String s, String t){
        HashMap<Character,Character> stot = new HashMap<>();
        HashMap<Character,Character> ttos = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char _s = s.charAt(i);
            char _t = t.charAt(i);
            if(!stot.containsKey(_s) && !ttos.containsKey(_t)){
                stot.put(_s,_t);
                ttos.put(_t,_s);
            }else if(stot.get(_s) == null){
                return false;
            }else if(ttos.get(_t) == null){
                return false;
            }else if(stot.get(_s) != _t && ttos.get(_t) != _s){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "aed";
        System.out.print(isometric(s,t));
    }
}