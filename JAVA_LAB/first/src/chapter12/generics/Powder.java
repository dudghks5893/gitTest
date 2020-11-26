package chapter12.generics;

public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}

class Plastic extends Material{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
	
}

class Glass extends Material{
	public void doPrinting() {
		System.out.println("Glass 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Glass 입니다.";
	}
}