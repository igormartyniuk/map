package Library;

public class Book {

	private String BookName;
	private String yearOfPublication;
	private int numberOfPages;
	
	public Book(String bookName, String yearOfPublication, int numberOfPages) {
		super();
		BookName = bookName;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
