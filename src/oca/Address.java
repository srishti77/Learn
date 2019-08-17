package oca;

class Location{
	public String getAddress(String street, String city) throws Exception{
		return "Unsupported String";
	}
}
public class Address extends Location {
	public String getAddress(String street, String city) throws Exception {
		try {
			return street.toString()+" "+ city.toString();
		}
		finally {
			System.out.println("posted");
		}
	}
	
	public static void main(String s[]) {
		String stree = "350 5th Ave";
		String ave = "New York";
		
		try {
			//if the Excpetion thats thrown is a checked exception then try catch is necessary
			// or throws is necessary
			//Address().getAddress(stree, ave);
			
		}
		finally {
			
		}
		System.out.println();
	}
	
}
