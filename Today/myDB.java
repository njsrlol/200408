package FXML.Today;

import java.util.HashMap;

public class myDB {
	
	HashMap<String, String> hashmap;
	
	public myDB() {
		hashmap = new HashMap<String, String>();
		
		hashmap.put("admin", "1");
		hashmap.put("1", "1");
		hashmap.put("2", "2");
	}
	
	
	public String getPw(String Id) {
		return hashmap.get(Id);
	}
	
	
	
}
