package com.capgemini.bookstore.services.library.to;

public class LibraryBookTo {
	private Long id;
	private String author;
	private String title;
	private String genere;
	private String plot;
	private String publisher;
	private Boolean hardcover;

	public Boolean getHardcover() {
		return hardcover;
	}

	public void setHardcover(Boolean hardcover) {
		this.hardcover = hardcover;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
