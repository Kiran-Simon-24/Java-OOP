package oop.Library;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("Kiran","2000-07-24");
		
		Book book = new Book("Harry Potter and the Philosopher's Stone", "J.K Rowling", 223);
		
		AudioBook  audioBook = new AudioBook("Harry Potter and the Deathly Hallows" , "J.K Rowling" , "22 hours");
		
		Ebook eBook = new Ebook("Harry Potter and the Philosopher's Stone", "J.K Rowling", 223, "PDF");
		
		user.borrow(book);
//		
//		System.out.println("Name: " + user.getName() + "\nBirthDay: " + user.getbirthDay() 
//							+ "\nAge: " + user.age() );
//		System.out.printf("%s has borrowed these books: %s ", user.getName(), user.borrrowedBooks());
//		System.out.println();
		
		System.out.println(eBook.toString());
		System.out.println();
		System.out.println(audioBook.toString());
	}

}
