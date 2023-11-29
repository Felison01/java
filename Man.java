import java.util.Scanner;
 class Man {
  static void checkAge(int age) {
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
    } else {
      System.out.println("Access granted - You are old enough!");
    }
  }
  public static void main(String[] args) {
	  Scanner newObj = new Scanner(System.in);
	  System.out.print("Enter age ");
	  int Age = newObj.nextInt();
    checkAge(Age);
  }
}