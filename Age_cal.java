import java.util.Scanner;
class Age_cal{
	public static void main(String[]args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter current year: ");
		int currentYear = obj.nextInt();
		System.out.print("Enter the year you were born: ");
		int year = obj.nextInt();
		int age = currentYear - year;
		System.out.println("Your age is: "+Math.abs(age));
	}
}