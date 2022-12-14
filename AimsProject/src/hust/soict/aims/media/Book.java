package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}
	public Book(int id, String title, String category, float cost) {
		super();
	}
	public boolean addAuthor(String authorName){
	        if (authors.contains(authorName)) {
	            System.out.println("Already exists!");
	            return false;
	        }
	        authors.add(authorName);
	        return true;
	    }
	
	public boolean removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Doesn't exist!");
            return false;
        }
        authors.remove(authorName);
        return true;
    }
}
