package myFirstRepo;

public class John {

	public static void main(String[] args) {
	// this is a addition method
		System.out.println(addition(3,2));
		System.out.println(multiply(5,3));
		System.out.println(division(25,3));
	}
	
	public static int addition(int num1 , int num2) {
		return num1+num2;
	}
	
	public static int multiply(int num1 , int num2) {
		return num1*num2;
	}
	public static int subtraction(int num1 , int num2) {
		return num1-num2;
	}
	
	public static int division(int num1 , int num2) {
		return num1/num2;
		//I just want to add something fun
	}
	
}
