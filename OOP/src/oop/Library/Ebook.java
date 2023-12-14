package oop.Library;


public class Ebook extends Book{
	private String format;
	
	Ebook(String title, String author, int pageCount ,String format) {
		super(title, author ,pageCount);
		
		this.format = format;
	}
	
	public String format() {
		return this.format;
	}
	
	@Override
	public String toString() {
		return String.format("%s by %s \nFormat: %s", this.getTitle(),this.getAuthor(), this.format);
	}

}
