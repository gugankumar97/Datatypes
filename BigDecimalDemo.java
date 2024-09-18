package DataTypes;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal TotalEggCost = BigDecimal.valueOf(2000);
		System.out.println(TotalEggCost);
		BigDecimal No_Of_Eggs = BigDecimal.valueOf(3);
		System.out.println(No_Of_Eggs);
		System.out.println((double)2000/3);
		BigDecimal Per_Egg_Cost = TotalEggCost.divide(No_Of_Eggs, RoundingMode.CEILING);
		
		System.out.println(Per_Egg_Cost);
		
		float f1 = 15.5f;
		float f2 = 12.2f;
		
		System.out.println(f1-f2);
		BigDecimal f3 = BigDecimal.valueOf(15.5).setScale(3);
		BigDecimal f4 = BigDecimal.valueOf(12.2).setScale(3);
		System.out.println(f3.subtract(f4));
		
		
		
		
	}

}
