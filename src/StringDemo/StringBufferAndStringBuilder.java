package StringDemo;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {

		String str = "Hello";
		// String//
		// StringBuilder 1.5
		// StringBuffer
		// String Builder vs StringBuffer -

		// StringBuffer - synchronized but less efficient, 1.0
		// appned, reverse, delete , setlenth

		// StringBuilder ss = new StringBuilder();
		StringBuffer sb = new StringBuffer("Hello");
		int sbLength = sb.length();
		//System.out.println(sbLength);
		int sbCapacity = sb.capacity();
		// System.out.println("String Length of " + sb + " is " + sbLength);
		// System.out.println("Capacity of " + sb + " is " + sbCapacity);
//
//		sb.append(" World ");
//
//		System.out.println(sb);
//
//		sb.append(2020);
//
//		System.out.println(sb);

//		System.out.println(sb);
//		StringBuffer sb = new StringBuffer("Hello World");
//
		// System.out.println(sb.reverse());

		// palindrome
		String school = "madam";
		StringBuffer sbb = new StringBuffer(school);
	//	System.out.println(" sbb " + sbb);

//		String sw = sbb.reverse().toString();
//		System.out.println(" sw " + sw);
//
//		if (sw.equalsIgnoreCase(school)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not Palindrome");
//		}
		
	
//
		StringBuffer sbt = new StringBuffer("Hello World 2020");
		System.out.println(sbt);
	//	System.out.println(sbt.delete(5, 11)); // prints Hello
		//System.out.println("Affter delete " +sbt.delete(2, 11));
//
//		StringBuffer sb = new StringBuffer("Hello World!");
//		StringBuffer sb = new StringBuffer("Hello World!");

	//	System.out.println(sbt.replace(6, 11, "Earth")); // prints "Hello Earth!"
//
		System.out.println(sbt.deleteCharAt(10)); // prints "Hello World"
		
//	

	}

}
