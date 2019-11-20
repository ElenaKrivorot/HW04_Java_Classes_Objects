package by.krivorot.hw04.task03.logic;

import java.util.ArrayList;
import java.util.List;

import by.krivorot.hw04.task03.emptity.Group;
import by.krivorot.hw04.task03.emptity.Student;

public class GroupLogic {
	private StudentLogic stlogic = new StudentLogic();

	public List<Student> takeALevelStudents(Group group) {
		List<Student> results = new ArrayList<Student>();
		int i;
		
		for (i = 0; i < group.getStudents().length; i++) {
			if(stlogic.isALevel(group.getStudents(i))) {
				results.add(group.getStudents(i));
			}
		}
		return results;
	}
}
