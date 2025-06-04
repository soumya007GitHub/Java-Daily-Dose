// implementing all compound assignment operators
class Main
{
	public static void main(String[] args) {
	   byte num1 = 20;
	   System.out.println("Addition: "+(num1+=2));
	   System.out.println("Substraction: "+(num1-=3));
	   System.out.println("Multiplication: "+(num1*=4));
	   System.out.println("Division: "+(num1/=5));
	   System.out.println("Modulus: "+(num1%=6));
	   System.out.println("Bitwise AND & : "+(byte)(num1&=8));
	   System.out.println("Bitwise OR | : "+(byte)(num1|=9));
	   System.out.println("Bitwise XOR ^ : "+(num1^=12));
	   System.out.println("Bitwise left shift << : "+(num1<<3));
	   System.out.println("Bitwise Right Shift >> : "+(num1>>2));
	   System.out.println("Bitwise Unsigned Right Shift >>> : "+(num1>>>3));
	}
}
