package com.hubberspot.junit5.bookstore.model;

public class Book {
	private String bookid;
	private String title;
	private String publisher;
	
	public Book(String bookid, String title, String publisher) {
		this.bookid = bookid;
		this.title = title;
		this.publisher = publisher;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	

}
