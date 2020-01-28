package com.paran.bigdata.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paran.bigdata.dao.BookRestDao;
import com.paran.bigdata.dto.Book;

@Service
public class BookService{
	
	@Autowired
	private BookRestDao bookDao;
	
	public Book findById(Integer id) {
		System.out.println("get요청 findById 개발중");
		return null;
	}
	
	public Collection<Book> findAll() {
		return bookDao.selectAll();
	}

	public void delete(Integer id) {
		bookDao.deleteById(id);
	}

	public Book create(Book book) {
		Integer id = bookDao.insert(book);
		book.setBoard_ID(id);
		return book;
	}

}
