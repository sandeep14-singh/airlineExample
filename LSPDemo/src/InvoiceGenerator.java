import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvoiceGenerator {
	
	private static Logger logger = LoggerFactory.getLogger(InvoiceGenerator.class);
	
	public Integer generate(Itinerary itinerary, DefaultDiscountCalculator discountCalculator){
		
		Integer basePrice = itinerary.getBasePrice();
		Integer discount = discountCalculator.calculate(itinerary);
		Integer toBePaid = basePrice - discount;
		
		// Logging
		logger.info("Base price for itinerary : " + itinerary.getItineraryId() + " is : $" + itinerary.getBasePrice());
		logger.info("Total discount calculated for itinerary : " + itinerary.getItineraryId() + " is : $" + discount);
		logger.info("Guaranteed Discount component : $" + discountCalculator.getGuaranteedDiscount());
		logger.info("Final amount calculated to be paid for itinerary : " + itinerary.getItineraryId() + " is : $" + toBePaid);
		
		return toBePaid;		
	}

}
