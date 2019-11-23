package by.krivorot.hw04.task09.view;

import java.util.List;

import by.krivorot.hw04.task09.emptity.Book;

public class LibraryView {
	
	public void PrintFindBooks(List<Book> books) {
		int i;

		System.out.println("Find books are:");
		for (i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
			
		}
	}

}
