package by.krivorot.hw04.task09.logic;

import java.util.ArrayList;
import java.util.List;

import by.krivorot.hw04.task09.emptity.Book;
import by.krivorot.hw04.task09.emptity.Library;

public class LibraryLogic {

	public List<Book> findByAuthor(Library library, String author) {
		int i;
		List<Book> books = library.getLibrary();
		List<Book> findBooks = new ArrayList<Book>();
		
		for (i = 0; i < books.size(); i++) {			
			if (books.get(i).getAuthor().contains(author) ) {
				findBooks.add(books.get(i));
			}

		}
		return findBooks;
	}
	
	public List<Book> findByPublishingHouse(Library library, String publishingHouse) {
		int i;
		List<Book> books = library.getLibrary();
		List<Book> findBooks = new ArrayList<Book>();
		
		for (i = 0; i < books.size(); i++) {			
			if (books.get(i).getPublishingHouse().contains(publishingHouse) ) {
				findBooks.add(books.get(i));
			}

		}
		return findBooks;
	}
	
	public List<Book> findAfterGivenYear(Library library, int year) {
		int i;
		List<Book> books = library.getLibrary();
		List<Book> findBooks = new ArrayList<Book>();
		
		for (i = 0; i < books.size(); i++) {			
			if (books.get(i).getYearOfPublishing() > year) {
				findBooks.add(books.get(i));
			}

		}
		return findBooks;
	}

}
