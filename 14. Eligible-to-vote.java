// Eligible to vote or not
class Main
{
	public static void main(String[] args) {
	   byte age = 16;
	   boolean haveId = false;
	   if(age >= 18 && haveId){
	       System.out.println("You are eligible to vote!");
	   }
	   else if(age < 18 || haveId == false){
	       System.out.println("Please be at the age of 18 or above to vote as well as have ID proof!");
	   }
	}
}
