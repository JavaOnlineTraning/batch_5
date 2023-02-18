package com.BookService.Service;

import org.springframework.http.ResponseEntity;

import com.BookServiceDto.BookDTO;

public interface BookService {
	ResponseEntity<String> addBookToDB(BookDTO bookDTO);

}
