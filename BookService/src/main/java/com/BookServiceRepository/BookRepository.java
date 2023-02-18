package com.BookServiceRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookService.Entities.BookEntity;
@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer>{

}
