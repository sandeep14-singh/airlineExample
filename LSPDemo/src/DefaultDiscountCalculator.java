import org.joda.time.DateTime;

public class DefaultDiscountCalculator {
	
	private int guaranteedDiscount = GuaranteedDiscountAPI.get(new DateTime());
	
	public int calculate(Itinerary itinerary){
				 
		if(!(itinerary != null && isTravelDateInFuture(itinerary))){
			throw new RuntimeException("Invalid Itinerary");
		}

		int totalDiscount = guaranteedDiscount + fetchItineraryBasedDiscount(itinerary);
			    
		if(!(totalDiscount > 0 && totalDiscount < itinerary.getBasePrice())){
			throw new RuntimeException("Discount calcultation went wrong");
		}
		
		return totalDiscount;		
	}
	
	
	
	public int getGuaranteedDiscount() {
		return guaranteedDiscount;
	}
	
	protected boolean isTravelDateInFuture(Itinerary itinerary) {
		return itinerary.getTravelDate().isAfter(new DateTime());
	}
	
	private int fetchItineraryBasedDiscount(Itinerary itenary) {
		// Call the relevant API to fetch the applicable discount
		return 10;
	}

}
