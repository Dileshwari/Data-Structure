package Collection;

import java.util.HashMap;
import java.util.Map;

public class ObjectClassMethodHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer a=101;
        int hash=a.hashCode();
        System.out.println(hash);
        
        String s="Dileshwari";
        int hashString=s.hashCode();
        System.out.println(hashString);
       String snull=null;
       int no=snull.hashCode();
       System.out.println(no);
        
        
        Map<String, Integer> map=new HashMap<>();
        map.put("Dileshwari", 23);
        map.put("abc", 90);
        map.put("Ashi", 80);
        map.put("Abhi", 70);
        map.put("Anu", 40);
        map.put("Trib", 90);
        
        System.out.println(map);
        System.out.println(map.get("Ashi"));
        System.out.println(map.getOrDefault("Billi", 78));
        System.out.println("containKey: "+map.containsKey("Trib"));
        System.out.println("containKey: "+map.containsKey("Tri"));
        System.out.println("containValu: "+map.containsValue(80));
        System.out.println("containValu: "+map.containsValue(45));
        System.out.println("isEmpty: "+map.isEmpty());
        
        
        	
	}

}
