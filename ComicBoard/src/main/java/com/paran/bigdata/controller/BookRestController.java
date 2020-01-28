package com.paran.bigdata.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paran.bigdata.dto.Book;
import com.paran.bigdata.service.BookService;

//@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class BookRestController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public void getRestIndex(HttpServletResponse response) throws IOException {
		response.sendRedirect("./restindex.html");
	}
	
	@GetMapping("/books")
	public Collection<Book> readList() {
		return bookService.findAll();
	}

}
