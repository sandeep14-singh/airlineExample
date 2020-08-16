import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;

public class GuaranteedDiscountAPI {

	public static Integer get(DateTime dateOfBooking){
		Integer monthOfBooking = dateOfBooking.getMonthOfYear();
		return readDiscountFromDB(monthOfBooking);
	}

	private static Integer readDiscountFromDB(Integer monthOfBooking) {
		// Connect to DB to fetch the declared discount for a month
		Map<Integer, Integer> discounts = new HashMap<>();
		discounts.put(1, 10); // JAN discount
		discounts.put(2, 15); // FEB discount
		discounts.put(3, 5);  // MAR discount
		discounts.put(4, 11); // APR discount
		discounts.put(5, 20); // MAY discount
		discounts.put(6, 13); // JUN discount
		discounts.put(7, 15); // JUL discount
		discounts.put(8, 17); // AUG discount
		discounts.put(9, 10); // SEP discount
		discounts.put(10, 16); // OCT discount
		discounts.put(11, 20); // NOV discount
		discounts.put(12, 25);	// DEC discount	
		return discounts.get(monthOfBooking);		
		
	}
	
	
}
