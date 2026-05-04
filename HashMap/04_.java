import java.util.*;

public class Main{
	public static void main(String[] args) {
		HashMap<String,String> destinaion = new HashMap<>();
		
		destinaion.put("chennai","bengaloor");
		destinaion.put("Mumbai","Delhi");
		destinaion.put("Delhi","Goa");
		destinaion.put("Goa","chennai");
		
		String start = getstart(destinaion);
		
		while(destinaion.containsKey(start)){
		    System.out.print(start+ "-->");
		    start = destinaion.get(start);
		}
		System.out.println(start);
	}
	
	
	
	public static String getstart(HashMap<String,String> tick){
	    HashMap<String,String> rev = new HashMap<>();
	    
	    for(String key : tick.keySet()){
	        rev.put(tick.get(key), key);
	    }
	    
	    for(String key : tick.keySet()){
	        if(!rev.containsKey(key)){
	            return key;
	        }
	    }
	    return null;
	}
}