package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		
		Set<Double> set1 = new HashSet<>();
		
		set1.add(1.5);
		set1.add(8.25);
		set1.add(-7.32);
		set1.add(13.3);
		set1.add(-12.45);
		set1.add(48.5);
		set1.add(0.01);
		
		Iterator<Double> iterator = set1.iterator();
		while (iterator.hasNext()) {
		Double myDouble = iterator.next();
		System.out.println(myDouble);
		}
		
		double valMax = Collections.max(set1);
		System.out.println("Plus grand élément : " + valMax);
		
		double valMin = Collections.min(set1);
		System.out.println("Plus petit élément : " + valMin);
		
		set1.remove(valMin);

		Iterator<Double> iterator2 = set1.iterator();
		while (iterator2.hasNext()) {
		Double myDouble = iterator2.next();
		System.out.println(myDouble);
		
		
		
		}
		
		System.out.println(Double.MIN_VALUE);
		
	}

}
