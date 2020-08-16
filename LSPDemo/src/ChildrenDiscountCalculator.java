
public class ChildrenDiscountCalculator extends DefaultDiscountCalculator {
	
	public int calculate(Itinerary itinerary){
		 
		if(!(itinerary != null && isTravelDateInFuture(itinerary))){
			throw new RuntimeException("Invalid Itinerary");
		}		
	
		int totalDiscount = getGuaranteedDiscount() + fetchItineraryBasedChildrenDiscount(itinerary);		
			    
		if(!(totalDiscount > 0 && totalDiscount < itinerary.getBasePrice())){
			throw new RuntimeException("Discount calcultation went wrong");
		}		
		
		return totalDiscount;		
	}
	
	private int fetchItineraryBasedChildrenDiscount(Itinerary itenary) {
		// Call the relevant API to fetch the applicable discount
		return 20;
	}

}
