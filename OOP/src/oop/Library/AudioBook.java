package oop.Library;

public class AudioBook extends Book {
	private String runTime;
	
	AudioBook (String title, String author, String runTime){
		super(title, author, 0);
		this.runTime = runTime;		
	}
	
	public String getrunTime() {
		return this.runTime;
	}
	
	@Override
	public String toString() {
		return String.format("%s by %s \nRunTime: %s", this.getTitle(),this.getAuthor(), this.runTime);
	}
}
