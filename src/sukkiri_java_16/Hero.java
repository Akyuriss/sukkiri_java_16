package sukkiri_java_16;
import java.util.*;

public class Hero {
	private String name;
	public Hero(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	Hero h1 = new Hero("saito"); //$NON-NLS-1$
	Hero h2 = new Hero("suzuki");//$NON-NLS-1$
	
	List<Hero> list = new ArrayList<Hero>();
	list.add(h1);
	list.add(h2);
	
	for(Hero h : list) {
		System.out.println(h.getName());
	}

}
