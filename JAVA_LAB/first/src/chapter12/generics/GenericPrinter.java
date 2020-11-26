package chapter12.generics;

// 그냥 T만 입력하면 아무런 자료형을 사용해도됨 (지금은 머터리얼에 상속받은 자료형만 사용)
public class GenericPrinter<T extends Material> {
	private T material; //자료형 T
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
	}
}
