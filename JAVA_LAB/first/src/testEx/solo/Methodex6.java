package testEx.solo;

public class Methodex6 {

	public static void main(String[] args) {
		
		int dud = 96;
		int ghks = 85;
		int co = 76;
		System.out.printf("%d��->%S\n",dud,grade(dud));
		System.out.printf("%d��->%S\n",ghks,grade(ghks));
		System.out.printf("%d��->%S\n",co,grade(co));
			
	}
	public static String grade(int A) {
		String	ac = "";
		if(A>=95) {
			ac = "A+";
		}
		else if(A>=90) {
			ac = "A0";
		}
		else if(A>=80) {
			ac = "B+";
		}
		else if(A>=70) {
			ac = "B0";
		}
		else {
			ac = "C+";
		}
		return ac;
	}
}