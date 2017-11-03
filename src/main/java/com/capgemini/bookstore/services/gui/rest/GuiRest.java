package com.capgemini.bookstore.services.gui.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.core.books.BookMaintenance;
import com.capgemini.bookstore.services.gui.to.BookGuiTo;

import ma.glasnost.orika.MapperFacade;

@RestController
@RequestMapping(value = "/gui/rest")
public class GuiRest {

	@Autowired
	private BookMaintenance service;

	@Autowired
	private MapperFacade mapper;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public List<BookGuiTo> getBooks() {

		List<BookGuiTo> bookTos = service.readBooks().stream()//
				.map(bookBo -> this.mapper.map(bookBo, BookGuiTo.class))//
				.collect(Collectors.toList());

		return bookTos;
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {

		service.deleteBook(id);

	}

}
