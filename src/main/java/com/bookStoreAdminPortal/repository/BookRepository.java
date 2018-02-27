package com.bookStoreAdminPortal.repository;


import org.springframework.data.repository.CrudRepository;

import com.bookStoreAdminPortal.domain.Book;



public interface BookRepository extends CrudRepository<Book, Long>{



}
