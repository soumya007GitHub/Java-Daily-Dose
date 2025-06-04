// checking a number is power of 2 or not using bitwise operator

//  Logic - we will find the number-1 first and will do the (num1 & num2) by doing Bitwise AND 
// on both the result will definitely in zeros which depicts yes the number is power of 2

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
        int num1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number : ");
        num1 = obj.nextInt();
        int num2 = num1 - 1;
        if((num1 & num2) == 0){
            System.out.println("Yes the number is power of 2");
        }
        else{
            System.out.println("No the number is not a power of 2");
        }
	}
}
