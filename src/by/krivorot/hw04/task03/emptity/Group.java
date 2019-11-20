package by.krivorot.hw04.task03.emptity;

import java.util.Arrays;

public class Group {
	private int number;
	private int quantity;
	private Student[] students;

	public Group(int number, int quantity) {
		this.number = number;
		this.quantity = quantity;
		this.students = new Student[quantity];
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	private int nextEmptyCell = 0;

	public void setStudents(Student student) {
		if (nextEmptyCell < 10) {
			students[nextEmptyCell] = student;
			nextEmptyCell++;
		}
	}

	public Student getStudents(int index) {
		return students[index];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + quantity;
		result = prime * result + Arrays.hashCode(students);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (number != other.number)
			return false;
		if (quantity != other.quantity)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}

	

	

}
