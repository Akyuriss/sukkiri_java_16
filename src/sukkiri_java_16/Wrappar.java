package sukkiri_java_16;

import java.util.ArrayList;

public class Wrappar {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(30);
		points.add(15);
		points.add(80);
		
		for(int i=0 ; i < points.size();i++) {
			System.out.println(points.get(i));
		}
		for(int j : points) {
			System.out.println(points.get(j));
		}
	}
}
