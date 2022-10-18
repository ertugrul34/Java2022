package entities;

public class Category {

	private int Id;
	private String categoryName;

	public Category(int id, String categoryName) {
		super();
		Id = id;
		this.categoryName = categoryName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
