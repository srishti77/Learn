package oca;

import java.io.*; 
class School {

	public int getNumberOfStudentsPerClassroom(String... students) throws IOException {
		return 3;
	}
	public int getNumberOfStudentsPerClassroom() throws IOException { 
		return 9;
		} 
	}

public class HighSchool extends School 
{
	public int getNumberOfStudentsPerClassroom() throws FileNotFoundException {
		return 2; 
	}

	public static void main(String[] students) throws IOException { 
		School school = new HighSchool(); 
		System.out.print(school.getNumberOfStudentsPerClassroom());
	} 
}