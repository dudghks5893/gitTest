package chapter10.Customer;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
