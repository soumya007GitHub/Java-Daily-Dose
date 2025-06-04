// overflow and underflow behaviour using byte and short dataType
class Main
{
	public static void main(String[] args) {
        /* Overflow happens when a calculation results in a value larger than the maximum representable 
        value for the data type. For example, if you add 1 to the maximum value of an int, the result 
        will "wrap around" to the minimum value of an int (a negative number). Java does not throw an 
        exception for overflow, which can lead to unexpected results. */
	   byte num1 = 127;
	   num1 += 1;  // 128
	   System.out.println(num1); // -128
	   
	   short num3 = 32767;
	   num3 += 1;  // 32768
	   System.out.println(num3); // -32768
	   
	   
	   /*Underflow occurs when a calculation results in a value smaller than the minimum representable 
	   value for the data type. For integer types, this also results in a "wrap around" effect. For 
	   floating-point types, underflow often leads to a result of zero or a very small value that is 
	   indistinguishable from zero. Similar to overflow, Java does not throw exceptions for underflow.*/
	   
	   byte num2 = -128;
	   num2 += -1;  //  -129
	   System.out.println(num2); // 127
	   
	   short num4 = -32768;
	   num4 += -1;  // -32769
	   System.out.println(num4); // 32767
	}
}
