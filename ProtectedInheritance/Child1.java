package pack2;
import pack1.Parent;
public class Child1 extends Parent{
	  static void m5(){
		System.out.println("child class - default method");
	}
	public static void main(String[]args){
		Child1 p = new Child1();
		p.m1();
		//cannot access private method 
		//p.m2();
		p.m3();
		//default within the package
		//p.m4();
		m5();
	}
}