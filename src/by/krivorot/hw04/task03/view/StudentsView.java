package by.krivorot.hw04.task03.view;

import java.util.List;

import by.krivorot.hw04.task03.emptity.Student;

public class StudentsView {

	public void printALevelStudents(int grNumber, List<Student> aStudents) {
		int i;

		System.out.println("In group number " + grNumber + " A level students are:");
		for (i = 0; i < aStudents.size(); i++) {
			System.out.println(aStudents.get(i).getSurname());
		}
	}

}
