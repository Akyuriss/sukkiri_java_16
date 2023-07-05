package sukkiri_java_16;
import java.util.ArrayList;

public class Iterator {
	public void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("minato");
		names.add("asaka");
		names.add("koharu");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
	}
}
