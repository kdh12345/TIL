package nonspringmvc;

import java.util.HashMap;

public class HandlerMapping {
	//생성자 . http://localhost:8081/nonspringmvc/hello
	HashMap<String, Controller> mappings = new HashMap<>();
	public HandlerMapping() {
		mappings.put("hello", new HelloController());
		mappings.put("list", new ListController());
	}
	Controller getController(String key){
		System.out.println("키="+key);
		return mappings.get(key);
	}
}
