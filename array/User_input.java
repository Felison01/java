import java.util.Scanner;
class User_input{
	public static void main(String[]args){
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String User_name = myObj.nextLine();
		System.out.println("Name: " +User_name);
	}
}