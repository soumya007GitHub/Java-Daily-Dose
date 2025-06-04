// Finding area of rectangle
class Main
{
	public static void main(String[] args) {
	   byte length = 30;
	   byte breadth = 40;
	   short rectangle_area = (short)(length*breadth);
	   // java internally computes result of short*short as int so we need to explicity declare the result as short
	   System.out.println("Area of rectangle is : "+rectangle_area);
	}
}
