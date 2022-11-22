package randomUserApi;

import java.io.Serializable;

public class Name implements Serializable{
	private String title;
	private String first;
	private String last;
	//getters
	public  String getTitle() {
	return title;
}
//setters
	public  void setTitle(String title) {
	this.title = title;
}
//getters
	public  String getFirst() {
	return first;
}
//setters
	public  void setFirst(String first) {
	this.first = first;
}
//getters
	public  String getLast() {
	return last;
}
//setters
	public  void setLast(String last) {
	this.last = last;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
