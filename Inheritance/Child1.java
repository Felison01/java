package pack1;
public class Child1 {
	  static void m5(){
		System.out.println("child class - default method");
	}
	public static void main(String[]args){
		Parent p1 = new Parent();
		p1.m1();
		//cannot access private method 
		//p.m2();
		p1.m3();
		p1.m4();
		m5();
	}
}