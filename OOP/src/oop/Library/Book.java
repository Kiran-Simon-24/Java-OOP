package oop.Library;

public class Book {
	private String title;
	private String author;
	private int pageCount;
	
	Book(String title, String author,int pageCount){
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int pageCount() {
		return this.pageCount;
	}
	
	//Abstraction
	public String toString() {
		return String.format("%s by %s", this.title, this.author);
	}
}
