package com.capgemini.bookstore.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bookstore.persistence.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
