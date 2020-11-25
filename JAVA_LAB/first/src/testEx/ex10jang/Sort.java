package testEx.ex10jang;

public interface Sort {
	public void ascedning(int []arr);
	public void descending(int []arr);
	public void description();
	
}

class QuickSort implements Sort{


	@Override
	public void ascedning(int a[]) {
		System.out.println("Q실행");
	}

	@Override
	public void descending(int b[]) {
		System.out.println("Q실행하지마?");

	}

	@Override
	public void description() {
		System.out.println("Q가 뭐길래..");
	}
	
}

class HeapSort implements Sort{

	@Override
	public void ascedning(int a[]) {
		System.out.println("H실행");
	}

	@Override
	public void descending(int b[]) {
		System.out.println("H실행하지마?");
	}

	@Override
	public void description() {
		System.out.println("H가 뭐길래..");
	}
	
}

class BubbleSort implements Sort{

	@Override
	public void ascedning(int a[]) {
		System.out.println("B실행");
	}

	@Override
	public void descending(int b[]) {
		System.out.println("B실행하지마?");
	}

	@Override
	public void description() {
		System.out.println("B가 뭐길래..");
	}
	
}
