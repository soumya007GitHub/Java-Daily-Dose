// checking entered character is alphabet or digit or special character
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	   String word;
	   short character;
	   
	   Scanner obj = new Scanner(System.in);
	   
	   System.out.print("Enter word : ");
	   word = obj.next();
	   // taking first character of word and converting that to short dataType
	   character = (short)(word.charAt(0));
	   
	   System.out.println("Character : "+character);
	   
	   if(character >= 48 && character <= 57){
	       System.out.println("It's a digit");
	   }
	   else if(character >= 65 && character <= 90){
	       System.out.println("It's a capital letter");
	   }
	   else if(character >= 97 && character <= 122){
	       System.out.println("It's a small letter");
	   }
	   else{
	       System.out.println("It's a special symbol");
	   }
	}
}
