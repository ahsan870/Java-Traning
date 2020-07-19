package StringDemo;

public class StringDemo {

	public static void main(String[] args) {
// String pool

		String name = "Ahsan";

		char[] myChar = { 'H', 'e', 'l', 'l', 'o' };
		// System.out.println(myChar);
//100
//
//		String firstName = "Bangladesh";
//		String SecondName = "Bangladesh";
//
//		String thirdString = new String("Bangladesh");
		
//		System.out.println(firstName == SecondName);	
//		System.out.println(thirdString == SecondName);

//		if (SecondName == thirdString) {     
//			System.out.println("Equals");
//		}else
//		{
//			System.out.println("Not Equals");
//			}

//		if (SecondName.equals(thirdString)) {     
//			System.out.println("Equals");
//		}else
//		{
//			System.out.println("Not Equals");
//			}

//		if (SecondName.equalsIgnoreCase(thirdString)) {     
//			System.out.println("Equals");
//		}else
//		{
//			System.out.println("Not Equals");
//			}

//		if (SecondName.contains(thirdString)) {     
//			System.out.println("Equals");
//		}else
//		{
//			System.out.println("Not Equals");
//			}
		// contain
	
//		boolean con = firstName.contains("Ahsan");
////		System.out.println(con);
////		System.out.println(firstName.contains("Bangla"));
//		
//		
//		String isEmpltyStr = "";
//		boolean isEmpty = isEmpltyStr.isEmpty();
//		System.out.println(isEmpty);
//		// equals , contains, isEmpty
		// toUpperCase toLowerCase hashCode(), startwith , endwith,  length()
		String firstName = "ahsan";
		String lastName = " AHMED";
		
//		String fullName = firstName + lastName;
//		System.out.println(fullName);
//		String upperCase = firstName.toUpperCase();
//		String lowerCase = lastName.toLowerCase();
//		System.out.println(firstName);
//		
//		System.out.println(upperCase);
//		System.out.println(lastName);
//		System.out.println(lowerCase);
//		System.out.println(lastName.hashCode());
//		System.out.println(firstName.hashCode());
//
//		System.out.println(firstName.startsWith("ri"));
//		System.out.println(lastName.endsWith("MD"));
		//System.out.println(firstName.length());
//		System.out.println(firstName.concat(" Ahmed"));
//		String concatString = firstName.concat(" Ahmed");
//		System.out.println(concatString);
		// toUpperCase toLowerCase hashCode(), startwith , endwith,  length(), indexof lastindexof, charAt, trim, split, replace
		// String firstN = "Sifat";
		// firstN.concat("Ahmed");
		// System.out.println(firstN);
		// length()
		// toUpperCase toLowerCase hashCode(), startwith , endwith

		String country = "United States of America";
//		System.out.println("Before trim " +country);
//		//char ch = country.charAt(0);
//		char ch = country.charAt(7);
//		int IndexOf = country.indexOf('i');
//		System.out.println(ch);
//		System.out.println(IndexOf);
//		
//		int indexof = country.indexOf('d'); // lastindexof
//		// remove space
//		String countryTring = country.trim(); // start and end
//        System.out.println("After trim " +countryTring);
//		String re = country.replace('U', 'i');
//		String he = country.replace('U', 'i');
//		System.out.println(country.replace('t', 'm'));
//		System.out.println(re);
////
	//	 System.out.println("After trim " +countryTring);
		
		//System.out.println(country.split(" "));
		
		String[] mySplit = country.split(" ");
		for (String i : mySplit) {
			System.out.println(i);
		}

		// ------------------------------------------

		// ------------------------------------------

	}

}
