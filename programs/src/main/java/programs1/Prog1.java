//get a value from main method and print it in  parameterised instance method
package programs1;
public class Prog1 {

	public static void main(String[] args) {
		Prog1 obj=new Prog1();
		obj.method1("Hi");
	}
	public void method1(String name)
	{
		System.out.println(name);
	}
}
