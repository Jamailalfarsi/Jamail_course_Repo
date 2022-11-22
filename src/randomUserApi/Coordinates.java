package randomUserApi;

import java.io.Serializable;

public class Coordinates implements Serializable {
	private String latitude;
	private String longitude;
	
// getters
	public String getLatitude() {
	return latitude;
}
//setters
	public void setLatitude(String latitude) {
	this.latitude = latitude;
}
//getter
	public String getLongitude() {
	return longitude;
}
//setters
	public void setLongitude(String longitude) {
	this.longitude = longitude;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
