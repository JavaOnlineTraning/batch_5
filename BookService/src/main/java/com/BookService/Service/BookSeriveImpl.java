package com.BookService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BookService.Entities.BookEntity;
import com.BookServiceDto.BookDTO;
import com.BookServiceRepository.BookRepository;

@Service
public class BookSeriveImpl implements BookService   {
	@Autowired
	BookRepository bookrepo;

	@Override
	public ResponseEntity<String> addBookToDB(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		BookEntity bookEntity = new BookEntity();
		 bookEntity.setBookName(bookDTO.getBookName());
		bookEntity.setBookAuthor(bookDTO.getBookAuthor());
		bookEntity.setPrice(bookDTO.getPrice());
		bookrepo.saveAndFlush(bookEntity);
	      return new  ResponseEntity<>("Record Inserted",HttpStatus.OK);
	}

}
