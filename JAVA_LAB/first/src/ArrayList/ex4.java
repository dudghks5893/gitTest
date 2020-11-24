package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Dog{
	//ÇÊµå
	private String name;
	private String type;
	
	//»ý¼ºÀÚ
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	//°Ù ¼Â ¸Þ¼Òµå
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String showDogInfo() {
		return name+","+type;
	}
	
}

public class ex4 {

	public static void main(String[] args) {
		Dog[] A = new Dog[5];
		
		Dog B1 = new Dog("ÃÊÄÚ","Çªµé");
		Dog B2 = new Dog("Á©¸®","Æ÷¸Þ");
		Dog B3 = new Dog("ÇÇÄ«Ãò","Æ÷ÄÏ¸ó");
		Dog B4 = new Dog("ÈòµÕÀÌ","¶Ë°³");
		Dog B5 = new Dog("°ËµÕÀÌ","´Ú½ºÈÆÆ®");

		A[0] = B1;
		A[1] = B2;
		A[2] = B3;
		A[3] = B4;
		A[4] = B5;
		
		
		ArrayList<Dog> AList = new ArrayList<Dog>();
		AList.add(B1);
		AList.add(B3);
		AList.add(B2);
		AList.add(B5);
		AList.add(B4);
//		AList.remove(2); °´Ã¼ Áö¿ì±â
//		System.out.println(AList);
//		Iterator iter = AList.iterator();
//		while(iter.hasNext()) {
//			
//		}
		System.out.println("=========¾î·¹ÀÌ¸®½ºÆ®==========");
		for(Dog n : AList) {
			System.out.println(n.showDogInfo());
		}
		
		System.out.println("=========¹è¿­¼Ó°´Ã¼µé==========");
		for(int i=0; i<A.length; i++) {
		System.out.println(A[i].showDogInfo());	
		}
		
	
	}

}
