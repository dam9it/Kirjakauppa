package com.kirjakauppa.domain;

public class Book {

	private String title;
	private String author;
	private Long year;
	private Long isbn;
	private Float price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year
				+ ", isbn=" + isbn + ", price=" + price + "]";
	}
	
}
