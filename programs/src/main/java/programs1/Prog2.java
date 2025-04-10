//get a value from main method and print it in non parameterised instance method
package programs1;
public class Prog2 {
String value;//global variable
	public static void main(String[] args) {
		Prog2 obj=new Prog2("Hi");
		obj.method1();
	}
	public void method1()//non parameterized instance method
	{
		System.out.println(value);
	}
	public Prog2(String value)//parameterized constructor
	{
		this.value=value;//this.instance variable=local variable;
	}
}
