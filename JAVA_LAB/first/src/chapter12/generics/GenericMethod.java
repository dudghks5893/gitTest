package chapter12.generics;

public class GenericMethod {

	public static void main(String[] args) {
		//Integer�� Number��ü�� ���� primitive data type���� ��ȯ. int�� �̹� primitive data type��.
		//Integer���� Number�� interface�� �����ϰ� �ִ�.
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0); //���� 0,0.0
		Point<Integer, Double> p2 = new Point<>(10,10.0); // ���� 10, 10.0
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴�"+rect+"�Դϴ�.");
		
	
	}
	
	//���ʸ� �޼���
	public static <T,V> double makeRectangle(Point<T,V>p1, Point<T,V>p2) {
		
//		double width = ((Number)p2.getx()).doubleValue() - ((Number)p1.getx()).doubleValue();
//		double height = ((Number)p2.gety()).doubleValue() - ((Number)p1.gety()).doubleValue();
		
		
		double left = ((Number)p1.getx()).doubleValue();
		double right = ((Number)p2.getx()).doubleValue();
		double top = ((Number)p1.gety()).doubleValue();
		double bottom = ((Number)p2.gety()).doubleValue();
		
		
		double width = right - left;
		double height = bottom - top;
		
		return width*height;
	}

}