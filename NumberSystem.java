package DataTypes;

public class NumberSystem {

	public static void main(String[] args) {
		
		int dec = 152;            //  no prefix   --> decimal literal
		int bin = 0b10011000;     // '0b' prefix --> binary literal
		int oct = 0230;           // '0' prefix  --> octal literal
		int hex = 0x97;           // '0x' prefix --> hexadecimal literal
		
		
		// Integer class method
		
	
	System.out.println(Integer.toBinaryString(20));  // decimal no 20 is converted to binary
	System.out.println(Integer.toOctalString(20));   // decimal no 20 is converted to octal
	System.out.println(Integer.toHexString(20));     // decimal no 20 is converted to hexadecimal
	
	

	}

}
