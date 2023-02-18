package com.BookServiceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookService.Service.BookService;
import com.BookServiceDto.BookDTO;

@RestController
public class BookController {
	@Autowired
	 BookService bookservice ;
	@PostMapping(value = "/addbook")
	public ResponseEntity<String>addBookToDB(@RequestBody BookDTO bookDTO){
		ResponseEntity<String> responseEntity = bookservice.addBookToDB(bookDTO);
		return responseEntity;
	}
}
