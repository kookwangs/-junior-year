package Test;
import java.util.Arrays;

public class Calculator {

//	public static void main(String[] args) {
//		printAns(divide(5,0));
//	}
	
	public static double add(double a,double b) {
		return a+b;
	}
	
	public static double minus(double a,double b) {
		return a-b;
	}
	
	public static double multiply(double a,double b) {
		return a*b;
	}
	
	public  static double divide(double a,double b) {
		return a/b;
	}

	
	public static void printAns(double c) {
		 System.out.printf("\n Answer is : %f",c);
	}
	
	
}

