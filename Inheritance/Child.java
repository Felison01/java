package pack1;
public class Child extends Parent{
	  void m5(){
		System.out.println("child class - default method");
	}
	public static void main(String[]args){
		Child p = new Child();
		p.m1();
		//cannot access private method 
		//p.m2();
		p.m3();
		p.m4();
		p.m5();
	}
}