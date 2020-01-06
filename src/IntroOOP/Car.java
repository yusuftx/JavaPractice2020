package IntroOOP;

public class Car {n   
	private String color;
	private double price;
	private int mileage;
	private String Model;
	private int year;

	public Car() {
	this("null", 0.0, 0, "null", 0);
	}
	
	public Car(String color, int mileage, String Model) {
		this.color = color;
		this.mileage = mileage;
		this.Model = Model;
		this.price = 0.0;
		this.year = 0;
	}
	
	public Car(String color, double price, int mileage, String Model, int year) {
		this.color = color;
		this.price = price;
		this.mileage = mileage;
		this.Model = Model;
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

