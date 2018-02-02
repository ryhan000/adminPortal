package com.bookStoreAdminPortal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStoreAdminPortal.domain.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	public String addBook(Model model) {
		Book book =new Book();
		model.addAttribute("book", book);
		
		return"addBook";
	}

}
