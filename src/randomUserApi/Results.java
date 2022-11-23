package randomUserApi;

import java.io.Serializable;

public class Results implements Serializable {
	private String gender;
	private String email;
	private String phone;
	private String cell;
	private String nat;
	
	
	
	
	
	private Coordinates coordinates;
	private Dob dop;
	private Id id;
	private Location location;
	private Login login;
	private Name name;
	private Picture picture;
	private Registered registered;
	private Street street;
	private Timezone timezone;
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCell() {
		return cell;
	}
	
	public void setCell(String cell) {
		this.cell = cell;
	}
	
	public String getNat() {
		return nat;
	}
	
	public void setNat(String nat) {
		this.nat = nat;
	}
	
	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public Dob getDop() {
		return dop;
	}
	
	public void setDop(Dob dop) {
		this.dop = dop;
	}
	
	public Id getId() {
		return id;
	}
	
	public void setId(Id id) {
		this.id = id;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Login getLogin() {
		return login;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public Picture getPicture() {
		return picture;
	}
	
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	
	public Registered getRegistered() {
		return registered;
	}
	
	public void setRegistered(Registered registered) {
		this.registered = registered;
	}
	
	public Street getStreet() {
		return street;
	}
	
	public void setStreet(Street street) {
		this.street = street;
	}
	
	public Timezone getTimezone() {
		return timezone;
	}
	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}
	
	
}