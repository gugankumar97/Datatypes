package DataTypes;

public class ExpressionTypes {

	public static void main(String[] args) {
		
		byte b = 1;
		byte b2 =2;
		
		//byte b3 =b+b2;;
		
		int s2 =b+b2;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;

		int intExpressionType = b+b; // assigning result to byte => type mismatch error
		int intExpressionType2 = s + s;
		int intExpressionType3 = b + i + c + s;

		long longExpressionType = i + l;

		float floatExpressionType = l + f;

		double doubleExpressionType = f + d;
		
		System.out.println(intExpressionType3);
		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335
		
		// CONCATENATION / APPEND
		
		System.out.println(2+8);  //10
		System.err.println("hello"+8+7); //hello87
		System.out.println("hello"+8+" "+7); //hello8 7 (if you want gap inbetween)
		System.out.println("notebook"+" "+"pen");
        System.out.println("123");

	}

}
