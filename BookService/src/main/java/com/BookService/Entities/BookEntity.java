package com.BookService.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "book_details")

public class BookEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private int srNo;
private String bookName;
private String bookAuthor;
private int price;
public int getSrNo() {
	return srNo;
}
public void setSrNo(int srNo) {
	this.srNo = srNo;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "BookEntity [srNo=" + srNo + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price
			+ "]";
}


}
