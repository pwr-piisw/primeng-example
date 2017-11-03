package com.capgemini.bookstore.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static String PERSONAL_DATA_PROPERTY = "personalData";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	@Column(nullable = true, length = 30)
	protected String author;

	@Column(nullable = true, length = 30)
	protected String title;

	// for hibernate
	public BookEntity() {

	}

	public BookEntity(Long id, String title, String author) {
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public Long getId() {

		return this.id;
	}

	public String getTitle() {

		return this.title;
	}

	public String getAuthor() {

		return this.author;
	}
}
