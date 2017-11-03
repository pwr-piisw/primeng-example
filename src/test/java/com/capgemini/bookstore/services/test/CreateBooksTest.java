package com.capgemini.bookstore.services.test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.bookstore.services.library.to.LibraryBookTo;
import com.capgemini.bookstore.services.library.to.builder.LibraryBookToBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CreateBooksTest {

	@Autowired
	private TestRestTemplate restTemplate;

	private static final String BASE_URL = "/services/rest/book";

	@Test
	public void shouldCreateBook() {
		// given
		LibraryBookTo book = new LibraryBookToBuilder()//
				.withAuthor("Ratajczak")//
				.withId(1L).withHardcover(true)//
				.withTitle("Programowanie Funkcyjne")//
				.build();

		// when
		ResponseEntity result = this.restTemplate.postForEntity(BASE_URL, book, LibraryBookTo.class);

		// then
		assertThat(result.getStatusCode(), equalTo(HttpStatus.CREATED));
	}

}
