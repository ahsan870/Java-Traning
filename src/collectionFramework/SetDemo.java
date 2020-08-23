package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		//hashSet, linkedSet, TreeSet
		
		// HashSet declaration
	      HashSet<String> hset = new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      
	      System.out.println("Display "+hset);
	      
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	   //   hset.add(null);
	   //   hset.add(null);

	      //Displaying HashSet elements
	      System.out.println("After add "+hset);
	      
	      //removing by index
	      hset.remove("Mango");
	      System.out.println(hset);
	      
	      //-------------------------------------------------
	      
	      LinkedHashSet<String> lhset = new LinkedHashSet<String>();

	         // Adding elements to the LinkedHashSet
	         lhset.add("Z");
	         lhset.add("PQ");
	         lhset.add("N");
	         lhset.add("O");
	         lhset.add("KK");
	         lhset.add("FGH");
	         System.out.println("LinkedHasSet "+lhset);
	         
	         lhset.add("FGH");
	         System.out.println("Not added "+lhset);
	         
	         //------------------------------------------------
	         
	         // TreeSet of String Type
	         TreeSet<String> tset = new TreeSet<String>();

	         // Adding elements to TreeSet<String>
	         tset.add("ABC");
	         tset.add("JKL");
	         tset.add("MON");
	         tset.add("JKL");
	         tset.add("INK");
	         tset.add("GHI");
	         tset.add("DEF");

	         //Displaying TreeSet
	         System.out.println("TreeSet "+tset);

	         // TreeSet of Integer Type
	         TreeSet<Integer> tset2 = new TreeSet<Integer>();

	         // Adding elements to TreeSet<Integer>
	         tset2.add(88);
	         tset2.add(7);
	         tset2.add(101);
	         tset2.add(0);
	         tset2.add(3);
	         tset2.add(222);
	         System.out.println("Integer "+tset2);
	         

	         // LinkedHashSet of Integer Type
	         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

	         // Adding elements
	         lhset2.add(99);
	         lhset2.add(7);
	         lhset2.add(0);
	         lhset2.add(67);
	         lhset2.add(89);
	         lhset2.add(66);
	         System.out.println("Integer "+lhset2);
	         
	       
	         
	      
	    }
	}


