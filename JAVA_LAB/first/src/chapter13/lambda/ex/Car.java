package chapter13.lambda.ex;

public class Car {
	//필드변수
	String make, model, color;
	int price;
	
	//생성자
	public Car(String make, String model, String color, int price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	//겟 셋
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	public void printCar() {
		System.out.println(this); // 객체의 주소 => toString이 실행되고 리턴값 출력
	}
	
	
	
}
