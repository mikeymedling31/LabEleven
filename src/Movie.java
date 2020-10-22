import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private String category;
	
	public Movie(String movTitle, String movCategory) {
		this.title = movTitle;
		this.category = movCategory;
	}

	public String getTitle() { 
		return title;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}	
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String newCategory) {
		this.category = newCategory;
	}
}	