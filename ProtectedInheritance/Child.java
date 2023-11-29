package pack1;
public class Child  {
	  static void m5(){
		System.out.println("child class - default method");
	}
	public static void main(String[]args){
		Parent p1 = new Parent();
		//can access anywhere public
		p1.m1();
		//cannot access private method 
		//p.m2();
		//can access within the package and also outside the package but with child reference protected
		p1.m3();
		//can access within the package default
		p1.m4();
		m5();
	}
}