package entities;

public class Course {

	private int Id;
	private String Coursename;
	private double unitPrice;

	public Course(int id, String coursename, double unitPrice) {
		super();
		Id = id;
		Coursename = coursename;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCoursename() {
		return Coursename;
	}

	public void setCoursename(String coursename) {
		Coursename = coursename;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
