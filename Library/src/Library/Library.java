package Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Library {

	Map<Author, List<Book>> map;
			
	public void library(){
		map = new HashMap<>();
	}
	
	public void addAuthor(){
		
		System.out.println("enter first name");
		String fName = Main.scanner.next();
		
		System.out.println("enter last name");
		String lName = Main.scanner.next();
	
		map.put(new Author(fName, lName), new ArrayList<Book>());
	}
	

	public void fixAuthorWithTheBook(){
		
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iter = set.iterator();
		
		System.out.println("enter author first name");
		String fName = Main.scanner.next();
		while (iter.hasNext()) {
			Entry<Author, List<Book>> temp = iter.next();
			if(fName.equalsIgnoreCase(temp.getKey().getFirsName())){
				
				System.out.println("enter book name");
				String bookName = Main.scanner.next();
				
				System.out.println("enter book yers of public");
				String bookYearOfPublic = Main.scanner.next();
				
				System.out.println("enter number of pages");
				int numbersOfPages = Main.scanner.nextInt();
				
				temp.getValue().add(new Book(bookName, bookYearOfPublic, numbersOfPages) );
				
			}
		}
		
	}
	
	public void removeTheBookThisAuthor(){
	
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iter = set.iterator();
		
		System.out.println("enter author first name");
		String fName = Main.scanner.next();
		
		while (iter.hasNext()) {
			Entry<Author, List<Book>> temp = iter.next();
			if(fName.equalsIgnoreCase(temp.getKey().getFirsName())){
				
				System.out.println("enter book name");
				String bookName = Main.scanner.next();
				
				System.out.println("enter book yers of public");
				String bookYearOfPublic = Main.scanner.next();
				
				System.out.println("enter number of pages");
				int numbersOfPages = Main.scanner.nextInt();
				
				temp.getValue().remove(new Book(bookName, bookYearOfPublic, numbersOfPages));
				
			}
		}
		
	}
	
	public void removeAuthorWithAllBooks(){
		
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iter = set.iterator();
		
		System.out.println("enter author first name");
		String fName = Main.scanner.next();
		
		while (iter.hasNext()) {
			Entry<Author, List<Book>> temp = iter.next();
			if(fName.equalsIgnoreCase(temp.getKey().getFirsName())){
				
				iter.remove();
				
			}
		}
		
	}
	
	public void removeAllBooksThisAuthor(){
		
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iter = set.iterator();
		
		System.out.println("enter author first name");
		String fName = Main.scanner.next();
		
		while (iter.hasNext()) {
			Entry<Author, List<Book>> temp = iter.next();
			if(fName.equalsIgnoreCase(temp.getKey().getFirsName())){
				
				temp.getValue().remove(temp);
				
			}
		}
		
	}
	
	public void sortBooksByAuthorByYearOfPublication(){
		
	}
	
	public void sortBooksByAuthorByNumbersOfPages(){
		
	}
	
	public void showAllLibrary(){
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iter = set.iterator();
		
		while (iter.hasNext()) {
			Entry<Author, List<Book>> temp = iter.next();
			System.out.println(temp.getKey()+" "+temp.getValue());
		}
		
	}
	
	public void exitProgram(){
			System.exit(0);
	}
	
	
	
	
	public void menu(){
		
		while (true) {
			
			library();
			
			System.out.println("1 - add author");
			System.out.println("2 - fix author with the book");
			System.out.println("3 - remove the book this author");
			System.out.println("4 - remove author with all books");
			System.out.println("5 - remove aal books this author");
			System.out.println("6 - show all librery");
			System.out.println("7 - exit");
			
			
			int choise = Main.scanner.nextInt();
			switch (choise){
				
				case (1):{
					addAuthor();
					break;
				}
				
				case (2):{
					fixAuthorWithTheBook();
					break;
				}
				
				case (3):{
					removeTheBookThisAuthor();
					break;
				}
				
				case (4):{
					removeAuthorWithAllBooks();
					break;
				}
				
				case (5):{
					removeAllBooksThisAuthor();
					break;
				}
				
				case (6):{
					showAllLibrary();
					break;
				}
				
				case (7):{
					exitProgram();
					break;
				}
				
				default:
					System.out.println ("error, try again");
					return;
				}
			}
		}
		
}
	
	
