package com.capgemini.bookstore.core.books;

import java.util.List;

import com.capgemini.bookstore.common.bo.BookBo;

public interface BookMaintenance {

	BookBo addBook(BookBo book);

	BookBo updateBook(BookBo book);

	BookBo readBook(long id);

	List<BookBo> readBooks();

	boolean deleteBook(long id);

}
