package sukkiri_java_16;
import java.util.HashMap;
import java.util.Map;

public class Map_test {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府",255); 
		prefs.put("東京都",300); 
		prefs.put("熊本", 400); 
		
		int Tokyo = prefs.get("東京都"); //$NON-NLS-1$
		System.out.println(Tokyo);
	}

}
