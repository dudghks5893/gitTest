package testEx.ex10jang;

public interface Sort {
	public void ascedning(int []arr);
	public void descending(int []arr);
	public void description();
	
}

class QuickSort implements Sort{


	@Override
	public void ascedning(int a[]) {
		System.out.println("Q����");
	}

	@Override
	public void descending(int b[]) {
		System.out.println("Q����������?");

	}

	@Override
	public void description() {
		System.out.println("Q�� ���淡..");
	}
	
}

class HeapSort implements Sort{

	@Override
	public void ascedning(int a[]) {
		System.out.println("H����");
	}

	@Override
	public void descending(int b[]) {
		System.out.println("H����������?");
	}

	@Override
	public void description() {
		System.out.println("H�� ���淡..");
	}
	
}

class BubbleSort implements Sort{

	@Override
	public void ascedning(int a[]) {
		System.out.println("B����");
	}

	@Override
	public void descending(int b[]) {
		System.out.println("B����������?");
	}

	@Override
	public void description() {
		System.out.println("B�� ���淡..");
	}
	
}