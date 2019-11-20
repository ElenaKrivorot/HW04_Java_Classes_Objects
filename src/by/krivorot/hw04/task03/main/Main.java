package by.krivorot.hw04.task03.main;

import java.util.List;

import by.krivorot.hw04.task03.emptity.Group;
import by.krivorot.hw04.task03.emptity.Student;
import by.krivorot.hw04.task03.logic.GroupLogic;
import by.krivorot.hw04.task03.view.StudentsView;

public class Main {

	public static void main(String[] args) {

		Group group = new Group(125, 10);
		group.setStudents(new Student("Alex", "Murrey", new int[] { 5, 9, 10, 4, 8 }));
		group.setStudents(new Student("Alex", "Smith", new int[] { 9, 9, 10, 10, 8 }));
		group.setStudents(new Student("Alex", "Trent", new int[] { 9, 9, 9, 9, 9 }));
		group.setStudents(new Student("Alex", "Bale", new int[] { 5, 9, 9, 4, 8 }));
		group.setStudents(new Student("Alex", "Murphy", new int[] { 7, 9, 10, 6, 8 }));
		group.setStudents(new Student("Alex", "Salah", new int[] { 10, 10, 10, 9, 10 }));
		group.setStudents(new Student("Alex", "Firminy", new int[] { 5, 9, 10, 4, 8 }));
		group.setStudents(new Student("Alex", "Klopp", new int[] { 5, 9, 10, 4, 8 }));
		group.setStudents(new Student("Alex", "Mane", new int[] { 5, 9, 10, 4, 8 }));
		group.setStudents(new Student("Alex", "Dake", new int[] { 8, 9, 10, 10, 9 }));

		GroupLogic grLogik = new GroupLogic();
		List<Student> aLevel = grLogik.takeALevelStudents(group);
		StudentsView view = new StudentsView();
		view.printALevelStudents(group.getNumber(), aLevel);
	}

}
