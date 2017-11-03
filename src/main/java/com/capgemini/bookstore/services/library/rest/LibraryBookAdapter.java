package com.capgemini.bookstore.services.library.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bookstore.common.bo.BookBo;
import com.capgemini.bookstore.services.library.to.LibraryBookTo;

import ma.glasnost.orika.MapperFacade;

@Service
public class LibraryBookAdapter {

	@Value("${library.url}")
	private String libraryUrl;

	@Autowired
	private MapperFacade mapper;

	public void sendBookDeletionRequest(BookBo book) {

		new RestTemplate().postForObject(libraryUrl, mapper.map(book, LibraryBookTo.class), LibraryBookTo.class);
	}

}
