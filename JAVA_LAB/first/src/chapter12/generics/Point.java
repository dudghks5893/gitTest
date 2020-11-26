package chapter12.generics;

public class Point<T,V> {
	T x;
	V y;
	
	public Point(T x, V y) { // x 매개변수 y 매개변수
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
