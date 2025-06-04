// Swapping two integer variables using thirs variable
class Main
{
	public static void main(String[] args) {
	   byte num1 = 10;
	   byte num2 = 20;
	   System.out.println("Before Swapping: ");
	   System.out.println("Num1: "+num1+" Num2: "+num2);
	   byte num3 = num2; // num3 = 20
	   num2 = num1;     // num2 = 10
	   num1 = num3;     // num1 = 20
	   System.out.println("\nAfter Swapping: ");
	   System.out.println("Num1: "+num1+" Num2: "+num2);
	}
}
