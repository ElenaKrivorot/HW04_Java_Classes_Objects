package by.krivorot.hw04.task03.logic;

import by.krivorot.hw04.task03.emptity.Student;

public class StudentLogic {

	public boolean isALevel(Student st) {
		int[] marks = st.getMarks();
		int i = 0;
		int count = 0;

		while (i < 5 && (marks[i] == 9 || marks[i] == 10)) {
			count++;
			i++;
		}
		if (count == 5) {
			return true;
		} else {
			return false;
		}
	}

}
