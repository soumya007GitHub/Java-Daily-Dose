// Calculate area, circumference of circle
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	   byte radius;
	   float area, circumference;
	   Scanner obj = new Scanner(System.in);
	   System.out.print("Enter radius: ");
	   radius = obj.nextByte();
	   System.out.println("The area of circle is : "+(Math.PI*radius*radius));
	   System.out.println("The circumference of circle is : "+(2*Math.PI*radius));
	}
}
