package JavaPrograms;

public class BookDemo {

	public static void main(String[] args) {
		Book b = new Book("Atomic habits", "James Clear", 17.20);
		
	System.out.println("Title : " + b.getTitle());
	System.out.println("Author Name : " + b.getAuthor_name());
//		System.out.println("Price : " + b.price);
		System.out.println(b);
		//b.setTitle("Becoming");
		//System.out.println(b);
	}

}
