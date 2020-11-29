package chapter12.collection.arraylist;

import java.util.ArrayList;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}


class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	
	public String pop() { //���̵�� �Ǿ��־� ���ϰ��� ������ ��
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("������ ������ϴ�");
			return null;
		}
		
		return(arrayStack.remove(len-1));
	}
}