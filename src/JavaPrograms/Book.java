package JavaPrograms;

public class Book {
	private String title;
	private String author_name;
	private double price;
	
	Book(String title, String author_name, double price){
		this.title = title;
		this.author_name = author_name;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Tile: " + title + "\nAuthor_name: " + author_name + "\nPrice: " + price;
	}

}
