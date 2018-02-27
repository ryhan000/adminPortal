package com.bookStoreAdminPortal.service;

import java.util.List;

import com.bookStoreAdminPortal.domain.Book;

public interface BookService {
	
	Book save(Book book);

	List<Book> findAll();
	
	Book findOne(Long id);

}
