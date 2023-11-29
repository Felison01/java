class Main{
	static void MyMethod(){
		System.out.println("hello world");
		
	}
	public void Mymethod(){
		System.out.println("This is public method ");
	}
	public static void main( String[]args){
		MyMethod();
		Main obj = new Main();
		obj.Mymethod();
		
	}
}