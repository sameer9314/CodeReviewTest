import java.util.concurrent.ConcurrentHashMap;

public class GenerateNumbers {

	private ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
	
	public void changeValue() {
		String something = map.get("test");
		String somethingElse = something + "something-else";
		map.put("test", somethingElse);
	}
	
}
