package chapter12.generics;

public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder ���� ����մϴ�.");
	}
	public String toString() {
		return "���� Powder �Դϴ�.";
	}
}

class Plastic extends Material{
	public void doPrinting() {
		System.out.println("Plastic ���� ����մϴ�.");
	}
	public String toString() {
		return "���� Plastic �Դϴ�.";
	}
	
}

class Glass extends Material{
	public void doPrinting() {
		System.out.println("Glass ���� ����մϴ�.");
	}
	public String toString() {
		return "���� Glass �Դϴ�.";
	}
}