//print local,static and instance variables in main method
package programs1;
public class Prog3 {
	static int a=5;//static variable
	int b=10;//instance variable
	public static void main(String[] args) {
		Prog3 obj=new Prog3();
		int c=3;//local variable
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(c);
	}
	
}
