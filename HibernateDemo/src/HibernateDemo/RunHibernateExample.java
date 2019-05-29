package HibernateDemo;

import java.util.*;


public class RunHibernateExample {

	public static void main(String[]args) {
		
		TestDAO t = TestDAO.getInstance();
		
		List<FamilyToSQL> c = t.getFamily();
		for (FamilyToSQL i : c) {
			System.out.println(i.getFullName());
		}
		
		System.out.println(t.toString());
	}
}
