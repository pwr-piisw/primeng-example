package com.capgemini.bookstore.common.mapper.test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.bookstore.common.bo.BookBo;
import com.capgemini.bookstore.services.library.to.LibraryBookTo;
import com.capgemini.bookstore.services.library.to.builder.LibraryBookToBuilder;

import ma.glasnost.orika.MapperFacade;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MapperFacadeTest {

	public static final String AUTHOR = "Adam";
	public static final String TITLE = "PIISW-lecture";
	public static final long ID = 69L;

	@Autowired
	private MapperFacade mapper;

	@Test
	public void libraryBookTo2BookBoMappingTest() {
		// Given
		LibraryBookTo lBTo = createLBTo();

		// When
		BookBo bookBo = this.mapper.map(lBTo, BookBo.class);

		// Then
		assertThat(bookBo.getId(), equalTo(ID));
		assertThat(bookBo.getAuthor(), equalTo(AUTHOR));
		assertThat(bookBo.getTitle(), equalTo(TITLE));
	}

	private LibraryBookTo createLBTo() {
		return new LibraryBookToBuilder()//
				.withAuthor(AUTHOR)//
				.withGenere("Drama")//
				.withTitle(TITLE)//
				.withPublisher("PWR")//
				.withId(ID)//
				.build();
	}

	@Test
	public void bookBo2LibraryBookToMappingTest() {
		// Given
		BookBo bookBo = createBBo();

		// When
		LibraryBookTo lBTo = this.mapper.map(bookBo, LibraryBookTo.class);

		// Then
		assertThat(lBTo.getId(), equalTo(ID));
		assertThat(lBTo.getAuthor(), equalTo(AUTHOR));
		assertThat(lBTo.getTitle(), equalTo(TITLE));
	}

	private BookBo createBBo() {
		BookBo book = new BookBo();
		book.setAuthor(AUTHOR);
		book.setId(ID);
		book.setTitle(TITLE);
		return book;
	}

}
