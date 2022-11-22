package randomUserApi;

import java.io.Serializable;

public class Dob implements Serializable{
	private String date;
	private int age;
	
//getter
public String getDate() {
	return date;
}
//setters
public void setDate(String date) {
	this.date = date;
}
// getters
public int getAge() {
	return age;
}
// setters
public void setAge(int age) {
	this.age = age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
