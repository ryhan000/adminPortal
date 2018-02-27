package com.bookStoreAdminPortal.serviceImpl;

import java.util.List;

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

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return (List<Book>) bookRepositor.findAll();
	}

	@Override
	public Book findOne(Long id) {
		// TODO Auto-generated method stub
		return bookRepositor.findOne(id);
	}

}
