package com.BookServiceDto;

public class BookDTO {
	private int srNo;
	private String bookName;
	private String bookAuthor;
	private int price;
	public int getSrNo() {
		return srNo;

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
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	@Override
	public String toString() {
		return "BookDTO [srNo=" + srNo + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price
				+ "]";
	}
}