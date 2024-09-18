package DataTypes;

public class OperatorMathClassDemo {

	public static void main(String[] args) {
		
		
		System.out.println(Math.PI);		// 3.141592653589793
		System.out.println(Math.max(8, 5)); // 8
		System.out.println(Math.min(3, 5));	// 3
		System.out.println(Math.sqrt(4));	// 2.0
		int absoluteValue = Math.abs(-2147483647);
		System.out.println(absoluteValue);	// 
		
		System.out.println(Math.sqrt(-1));	// NaN
		System.out.println(0 / 0.0);		// NaN
		System.out.println((0 / 0.0) + 5);	// NaN
		
		System.out.println(5 / 0.0);		// Infinity
		System.out.println(-5 / 0.0);		// -Infinity
		
		System.out.println(Math.round(20.0 / 3.0));						// 7
		System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67
		
		System.out.println(Math.random());						// between 0.0 and 1.0 (for capcha we will use random number)
		System.out.println((int)(Math.random() * 100)); 		// between 0 and 100 
		System.out.println((int)(Math.random() * 1000) + 1000); 	// between 1000 and 2000
		
		System.out.println(Math.ceil(878963578.25)); // returns the smallest (closest to negative infinity)
		System.err.println(Math.divideExact(20, 2)); // int x / int y (gives exact value)
		System.err.println(Math.divideExact(257984, 7354897)); // long x / long y (gives exact value)
		System.out.println(Math.round(15.8*25.7));  // round of two float numbers
		System.out.println(Math.round(25.25789654/8.248625478)); // round of two double numbers
		System.out.println(Math.addExact(25789547, 4732546)); // two int numbers exact add
		System.out.println(Math.ceilDiv(15, 4)); // divide intx/inty
		
		
		
		System.out.println(Math.round(51.5));
	    System.out.println(Math.ceil(51.5));
	    System.out.println(Math.ceil(51.3));
	    System.out.println(Math.floor(51.5));
		System.out.println(Math.floor(51.3));
		
		
		System.out.println(Math.ceil(-51.5));
		System.out.println(Math.ceil(-51.3));
		System.out.println(Math.floor(-51.5));
		System.out.println(Math.floor(-51.3));
		
		
		
	}

}
