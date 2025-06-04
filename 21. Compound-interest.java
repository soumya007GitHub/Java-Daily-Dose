// compound inerest
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
        double principal, rate, time;
        System.out.println("Enter principal amount, rate of interest & time : ");
        Scanner obj = new Scanner(System.in);
        principal = obj.nextInt();
        rate = obj.nextByte();
        time = obj.nextByte();
	    
	    double amount = principal*Math.pow(1+(rate/100), time);
	    System.out.println("The amount is : "+amount);
	}
}
