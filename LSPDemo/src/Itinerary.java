import java.util.List;

import org.joda.time.DateTime;

public class Itinerary {

	private String itineraryId;
	private List<Passenger> passengers;
	private String from;
	private String to;
	private DateTime travelDate;	
	private Integer basePrice;
	private String flightNumber;
	
	public Itinerary(String itineraryId, List<Passenger> passengers, String from, String to, DateTime travelDate,
			Integer basePrice, String flightNumber) {
		super();
		this.itineraryId = itineraryId;
		this.passengers = passengers;
		this.from = from;
		this.to = to;
		this.travelDate = travelDate;
		this.basePrice = basePrice;
		this.flightNumber = flightNumber;
	}

	public String getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(String itineraryId) {
		this.itineraryId = itineraryId;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public DateTime getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(DateTime travelDate) {
		this.travelDate = travelDate;
	}

	public Integer getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
}
