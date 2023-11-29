class Parameter1{
	static int myMethod(int x,int y){
		return x + y;
	}
	public static void main(String[]args){
		int z = myMethod(10 , 20);
		System.out.println(z);
	}
}