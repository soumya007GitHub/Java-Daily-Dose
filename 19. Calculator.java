// calculator
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	   byte num1;
	   byte num2;
	   char operator;
	   byte result = 0;
	   
	   Scanner obj = new Scanner(System.in);
	   System.out.println("Enter 2 numbers : ");
	   num1 = obj.nextByte();
	   num2 = obj.nextByte();
	   
	   System.out.print("Enter operator (+, -, *, /, %) : ");
	   operator = obj.next().charAt(0);
	   
	   switch(operator){
	       case ('+'):
	           result = (byte)(num1 + num2);
	           break;
	   
	       case ('-'):
	           result = (byte)(num1 - num2);
	           break;
	       
	       case ('*'):
	           result = (byte)(num1 * num2);
	           break;
	       
	       case ('/'):
	           result = (byte)(num1 / num2);
	           break;
	       
	       case ('%'):
	           result = (byte)(num1 % num2);
	           break;
	       
	       default:
	           System.out.println("Invalid operator input");
	       
	   }
	   System.out.println(result);
	}
}
