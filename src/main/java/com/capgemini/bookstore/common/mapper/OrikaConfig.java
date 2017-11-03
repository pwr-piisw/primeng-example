package com.capgemini.bookstore.common.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.bookstore.common.bo.BookBo;
import com.capgemini.bookstore.persistence.entity.BookEntity;
import com.capgemini.bookstore.services.gui.to.BookGuiTo;
import com.capgemini.bookstore.services.library.to.LibraryBookTo;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Configuration
public class OrikaConfig extends ConfigurableMapper {

	@Bean
	public MapperFacade mapper() {
		return new BookstoreMapper();
	}

	private class BookstoreMapper extends ConfigurableMapper {

		@Override
		protected void configure(MapperFactory factory) {
			factory.classMap(LibraryBookTo.class, BookBo.class).byDefault().register();
			factory.classMap(BookGuiTo.class, BookBo.class).byDefault().register();

			factory.classMap(BookBo.class, BookEntity.class).byDefault().register();
		}
	}
}