package com.bookStoreAdminPortal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStoreAdminPortal.domain.Book;
import com.bookStoreAdminPortal.repository.BookRepository;
import com.bookStoreAdminPortal.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepositor;

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepositor.save(book);
	}

}
