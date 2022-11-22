package randomUserApi;

import java.io.Serializable;

public class Location implements Serializable {
	private String city;
	private String state;
	private String country;
	private String postcode;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
