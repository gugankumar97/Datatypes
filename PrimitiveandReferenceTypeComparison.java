package DataTypes;

/**
 * primitive data type comparison (==)
 * reference data type comparison (equals)
 * in reference data type for byte range only we can compare using ==
 */

public class PrimitiveandReferenceTypeComparison {

	public static void main(String[] args) {
		
		float f1 = 10.25f;           // float = primitive data type
		float f2 = 10.25f;
		
		System.out.println(f1 == f2); // primitive data type compares the values (so it becomes true)
		
		Float f3 = 10.25f;           // Float = reference data type (rapper class)
		Float f4 = 10.25f;
		
		System.out.println(f3 == f4);  // reference data type stores the memory location of the value(so it is false)
		System.out.println(f3.equals(f4));
		
		
		double n1 = 86.578;            // double = primitive data type
		double n2 = 86.578;
		
		System.out.println(n1 == n2);  
		
		Double n3 = 86.578;           // Double = reference data type (rapper class)
		Double n4 = 86.578;
		
		System.out.println(n3 == n4);
		System.out.println(n3.equals(n4));
		
		
	    int i1 = 12;                   // int = primitive data type
	    int i2 = 12;
	    
	    System.out.println(i1 == i2); 
	    
	    
	    Integer i3 = 128;               // Integer = reference data type (rapper class)
	    Integer i4 = 128;
	    
	    System.out.println(i3 == i4);
	    
	    
	    Integer i5 = 127;      // for byte value -128 to 127 for reference data type also it checks the values
	    Integer i6 = 127;
	    
	    System.out.println(i5 == i6);
	    
	   

	}

}
