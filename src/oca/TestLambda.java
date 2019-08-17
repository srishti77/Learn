package oca;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestLambda {
	public static void main(String str[]) {
		Predicate<String> p = (String s) -> false;
		Shoot.prepare( 45, d -> d> 5 || d <-5);
		System.out.println();
		
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		xmas.plusDays(-1);
		System.out.println(xmas.getDayOfMonth());
		Period period = Period.ofDays(1);
		StringBuilder pdqw = new StringBuilder("6354");
		String st = "";

		pdqw = pdqw.insert(1,"dd");
		List<String> magazines = new ArrayList(); 
		magazines.add("Readers Digest");
		 magazines.add("People");
		 magazines.clear();
		 magazines.add("The Economist");
		 magazines.remove(1);
		 System.out.println(magazines.size());
	}
}

class Shoot{
	interface Target {
		boolean needtoAim(double angle);
	}
	
	static void prepare(double angle, Target t) {
		boolean ready = t.needtoAim(angle);	
		System.out.println(ready);
		String s = "Some text";
		s.concat("sdf");
		System.out.println(s);
		LocalDate lc = LocalDate.of(2016, 12, 22);
		List<Character> chars = new ArrayList<>();
		System.out.println(chars.size());
		
	}
	
	public static void secret( String mystery) {
		mystery = mystery.replace("1", "8"); 
		mystery.startsWith("paper");
		String s = mystery.toString();
		
	}
	
	
}
