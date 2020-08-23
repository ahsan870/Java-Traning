package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

//		List<String> alist = new ArrayList<String>();
//
//		alist.add("Ahsan");
//		alist.add("Riyad");
//		alist.add("Anik");
//		alist.add("Mamun");
//		alist.add("Saiful");
//		alist.add("Rijon");
//		
//		
//		// displaying elements
////		System.out.println("Display "+alist);
////
////		 alist.forEach(s -> System.out.println("forEach "+s));
//
//		// Adding "Monowar" at the fourth position
//		alist.add(3, "Monowar");
//
//		// displaying elements
//		System.out.println("After adding "+alist);
//
//		// removing by index
//		alist.remove(4);
//		System.out.println("After remove mamun bhai "+alist);
//
//		// removing by name
//		alist.remove("Ahsan");
//		System.out.println(alist);
//		int sizeOf = alist.size();
//		System.out.println(" Size of "+sizeOf);
//
//		int sizeof = alist.size();
//		System.out.println("Size of List " + sizeof);
		// ------------------------------------------------------------

		LinkedList<String> list = new LinkedList<String>();

		// Adding elements to the Linked list
		list.add("Ahsan");
		list.add("Riya");
		list.add("Anik");
		list.add("Mamun");
		list.add("Saiful");
		list.add("Rijon");

		System.out.println("List of  "+list);

		// Adding an element to the first position
		list.addFirst("Faruk");
		System.out.println(list);
		// Adding an element to the last position
		list.addLast("Raju");
		System.out.println(list);
		// Adding an element to the 3rd position
		list.add(2, "Rafi");
		System.out.println(list);

	}

}
