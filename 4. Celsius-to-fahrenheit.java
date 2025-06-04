// Converting celsius to fahrenheit temperature
class Main
{
	public static void main(String[] args) {
	   byte celsius = 24;
	   // we can't write (9/5) as that will be calculated as int so instead we need to write 9f instead of 9
	   float fahrenheit = (9f/5*celsius)+32;
	   System.out.println("The temperature in fahrenheit is: "+fahrenheit);
	}
}
