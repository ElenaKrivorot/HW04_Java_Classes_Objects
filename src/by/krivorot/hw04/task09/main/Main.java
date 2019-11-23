package by.krivorot.hw04.task09.main;

import by.krivorot.hw04.task09.emptity.Book;
import by.krivorot.hw04.task09.emptity.Library;
import by.krivorot.hw04.task09.logic.LibraryLogic;
import by.krivorot.hw04.task09.view.LibraryView;

public class Main {

	public static void main(String[] args) {

		Library library = new Library("Science library");
		library.setLibrary(new Book(2549, "Java", "Shildt G.", "Wiliams", 2010, 1500, 164, "soft"));
		library.setLibrary(new Book(1584, "C++", "Shildt G.", "Wiliams", 2008, 1500, 80, "soft"));
		library.setLibrary(new Book(4589, "Thinking in Java", "Eckel B.", "Peter", 2019, 1000, 70, "hard"));
		library.setLibrary(new Book(9548, "Head first Java", "Sierra K. Bates B.", "Ecsmo", 2019, 720, 33, "hard"));
		library.setLibrary(new Book(2613, "Thinking in C++", "Eckel B.", "Peter", 2004, 900, 60, "hard"));

		LibraryLogic logic = new LibraryLogic();
		
		LibraryView view = new LibraryView();
		
		view.PrintFindBooks(logic.findByAuthor(library, "Shildt"));
		view.PrintFindBooks(logic.findByPublishingHouse(library, "Ecsmo"));
		view.PrintFindBooks(logic.findAfterGivenYear(library, 2010));
	}

}
