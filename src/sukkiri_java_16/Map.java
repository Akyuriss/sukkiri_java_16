package sukkiri_java_16;
import java.util.*;

public class Map {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府",255);
		prefs.put("東京都",300);
		prefs.put("熊本", 400);
		
		int Tokyo = prefs.get("東京都");
		System.out.println(Tokyo);
	}
}
