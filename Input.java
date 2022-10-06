package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		String e=new String();
		int d=0;
		 System.out.printf("\n *✧･ﾟ:* ♡ Welcome to the calculator program ♡ *: ✧･ﾟ*");
		 do {
		 Scanner input = new Scanner(System.in);
		 double a=0;
		 
		 
		 do {
			 d=0;
			 System.out.printf("\n Input your operand 1: ");
		 try {
			 a = input.nextDouble();
			} catch (InputMismatchException ex) {
			    System.out.println("It is not a double. Please try again.");
			    d=-1;
			}
		 input.nextLine();
		 }while(d==-1);
		 
		 
		 
		 System.out.printf("\n 4 Operators; + - * /");
		 String opr = new String();
		 
		 do {
		 System.out.printf("\n Input your operator: ");
		 opr = input.nextLine(); 
		 if(!opr.equals("+")&&!opr.equals("-")&&!opr.equals("*")&&!opr.equals("/"))
 			System.out.println("\n !Please input only available operators; + - * /");
		 }while(!opr.equals("+")&&!opr.equals("-")&&!opr.equals("*")&&!opr.equals("/"));
		 
		 double b=0;
		 do {
			 d=0;
			 System.out.printf("\n Input your operand 2: ");
		 try {
			 b = input.nextDouble();
			} catch (InputMismatchException ex) {
			    System.out.println("It is not a double. Please try again.");
			    d=-1;
			}
		 input.nextLine();
		 }while(d==-1);
		 
		 
		 
		 double c = 0;
		 if(opr.equals("+"))
			c=Calculator.add(a, b);
		 else if(opr.equals("-"))
			c=Calculator.minus(a, b);
		 else if(opr.equals("*"))
			c=Calculator.multiply(a, b);
		 else if(opr.equals("/"))
			c=Calculator.divide(a, b);

		 System.out.println("\n Therefore, the answer of "+a+" "+opr+" "+b+" is: "+c
				 +"\nType \"y\" to calculate again, others to exit program.");
		 
		 e = input.nextLine();
		 }while(e.equalsIgnoreCase("y"));
		
		 System.out.printf("\nEnd program");
	}

}
