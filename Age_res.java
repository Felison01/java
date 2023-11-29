class Age{
	static void myMethod(int age){
		if(age>18){
			System.out.println("you are eligible");
		}
		else{
			System.out.println("you are not eligible");
		}
	}
	public static void main(String[]args){
		myMethod(22);
	}
}