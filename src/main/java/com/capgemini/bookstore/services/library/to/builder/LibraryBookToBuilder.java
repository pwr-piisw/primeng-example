package com.capgemini.bookstore.services.library.to.builder;

import com.capgemini.bookstore.services.library.to.LibraryBookTo;

public class LibraryBookToBuilder {

	private Long id;
	private String author;
	private String title;
	private String genere;
	private String plot;
	private String publisher;
	private Boolean hardcover;

	public LibraryBookToBuilder withHardcover(Boolean hardcover) {
		this.hardcover = hardcover;
		return this;
	}

	public LibraryBookToBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public LibraryBookToBuilder withAuthor(String author) {
		this.author = author;
		return this;
	}

	public LibraryBookToBuilder withGenere(String genere) {
		this.genere = genere;
		return this;
	}

	public LibraryBookToBuilder withPlot(String plot) {
		this.plot = plot;
		return this;
	}

	public LibraryBookToBuilder withPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}

	public LibraryBookToBuilder withTitle(String title) {
		this.title = title;
		return this;
	}

	public LibraryBookTo build() {
		LibraryBookTo book = new LibraryBookTo();
		book.setAuthor(author);
		book.setGenere(genere);
		book.setHardcover(hardcover);
		book.setId(id);
		book.setPlot(plot);
		book.setPublisher(publisher);
		book.setTitle(title);
		return book;
	}

}
