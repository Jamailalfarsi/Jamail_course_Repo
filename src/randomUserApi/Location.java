package randomUserApi;

import java.io.Serializable;

public class Location implements Serializable {
	private String city;
	private String state;
	private String country;
	private String postcode;
	
	
	private Street street;
	private Timezone timezone;
	private Coordinates coordinates;

	//getters
	public String getCity() {
	return city;
}

//setters
	public void setCity(String city) {
	this.city = city;
}

//getters
	public String getState() {
	return state;
}

//setters
	public void setState(String state) {
	this.state = state;
}

//getters
	public String getCountry() {
	return country;
}

//setters
	public void setCountry(String country) {
	this.country = country;
}

//getters
	public String getPostcode() {
	return postcode;
}

//setters
	public void setPostcode(String postcode) {
	this.postcode = postcode;
}
	

	/**
	 * @return the street
	 */
	public Street getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(Street street) {
		this.street = street;
	}

	/**
	 * @return the timezone
	 */
	public Timezone getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the coordinates
	 */
	public Coordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
