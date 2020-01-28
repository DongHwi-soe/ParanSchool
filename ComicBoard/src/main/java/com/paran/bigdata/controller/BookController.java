package com.paran.bigdata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paran.bigdata.service.BookService;

@Controller("/")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value="/books")
	public String getBookList(Model model) {
		model.addAttribute("books", bookService.findAll() );
		return "books";
	}
	
}
