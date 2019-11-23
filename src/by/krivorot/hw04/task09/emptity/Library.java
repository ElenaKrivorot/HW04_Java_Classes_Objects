package by.krivorot.hw04.task09.emptity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private List<Book> library;

	public Library(String name) {
		this.name = name;
		this.library = new ArrayList<Book>();
	}

	public Library(String name, ArrayList<Book> library) {
		this.name = name;
		this.library = library;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getLibrary() {
		return library;
	}

	public void setLibrary(List<Book> library) {
		this.library = library;
	}

	public Book getLibrary(int index) {
		return library.get(index);
	}

	public void setLibrary(Book book) {
		this.library.add(book);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library == null) ? 0 : library.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Library other = (Library) obj;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", library=" + library + "]";
	}
	
	

}
