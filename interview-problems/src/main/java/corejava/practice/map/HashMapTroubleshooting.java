package corejava.practice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTroubleshooting {

	public static void main(String[] args) {
		
		Map<Student, String> map = new HashMap<>();
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		map.put(s1, "Dinesh");
		map.put(s2, "Sahu");
		
		System.out.println(s1.hashCode()); // 1
		System.out.println(s2.hashCode());  // 1
		
		System.out.println(map.get(s1)); // Sahu
		System.out.println(map.get(s2)); // Sahu
		
		System.out.println(s1.equals(s2));  // true
		
		//System.out.println("Memory address of Object S1 is - " + VM.current().addressOf(s1)); // Physical  memory address is - 
		//System.out.println("Memory address of Object S2 is - " + VM.current().addressOf(s2)); // Physical  memory address is -

		System.out.println(s1==s2); // false - because hash code is same but physycal memory address of Object is different 
	
		System.out.println("hashCode: " + System.identityHashCode(s1));
		System.out.println("hashCode: " + System.identityHashCode(s2));
	}

}
