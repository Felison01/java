class Swap{
	public static void main(String[]args){
		float num1 = 20.5f , num2 = 32.21f;
		System.out.println("Before swap");
		System.out.println(num1);
		System.out.println(num2);
		float temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap");
		System.out.println(num1);
		System.out.println(num2);
		
	}
}