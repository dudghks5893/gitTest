package chapter12.generics;

public class Point<T,V> {
	T x;
	V y;
	
	public Point(T x, V y) { // x �Ű����� y �Ű�����
		this.x = x;
		this.y = y;
	}
	public T getx() {
		return x;
	}
	public V gety() {
		return y;
	}
	
}
