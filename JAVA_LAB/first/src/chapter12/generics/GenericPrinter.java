package chapter12.generics;

// �׳� T�� �Է��ϸ� �ƹ��� �ڷ����� ����ص��� (������ ���͸��� ��ӹ��� �ڷ����� ���)
public class GenericPrinter<T extends Material> {
	private T material; //�ڷ��� T
	
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
