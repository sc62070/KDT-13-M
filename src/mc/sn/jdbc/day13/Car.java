package mc.sn.jdbc.day13;

public class Car {
	private String brand;
	
	public Car() {	//기본 생성자
		
	}
	
	public Car(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
