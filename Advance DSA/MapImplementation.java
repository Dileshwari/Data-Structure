package Collection;

public class MapImplementation{
  
	
	private Entity[] entity;
	MapImplementation(){
		
		entity=new Entity[100];
	}
	
	class Entity{
		
		String key;
		String value;
		
		Entity(String key, String value) {
			
			this.key=key;
			this.value=value;
		}
	}
	
	public void put(String key, String value) {
		
		 int hash=Math.abs(key.hashCode() % entity.length );
		 entity[hash]=new Entity(key, value);
		 
	}
	
	public String get(String key) {
		
		 int hash=Math.abs(key.hashCode() % entity.length );
		 if(entity[hash] !=null && entity[hash].key.equals(key)) {
			 
			 return entity[hash].value;
		 }
		 return null;
	}
	
	public void remove(String key) {
		int hash=Math.abs(key.hashCode() % entity.length );
		if(entity[hash] !=null && entity[hash].key.equals(key)) {
			
			entity[hash]=null;
		}
		
	}
	public static void main(String[] args) {
		
		MapImplementation m=new MapImplementation();
		m.put("abc", "s");;
		m.put("ab", "c");;
		m.put("abca", "b");;
		m.put("abdhdbc", "a");;
		m.put("kkdd", "ljhsu");;
		System.out.println(m);
		
		System.out.println(m.get("abc"));
		
		
	}
}
