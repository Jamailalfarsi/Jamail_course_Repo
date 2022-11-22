package randomUserApi;

import java.io.Serializable;

public class info implements Serializable{
	private String seed;
	private int results;
	private int page;
	private String version;
	

	//getters
	public  String getSeed() {
		return seed;
	}


	//setters
	public  void setSeed(String seed) {
		this.seed = seed;
	}


	//getters
	public int getResults() {
		return results;
	}


	//Setters
	public  void setResults(int results) {
		this.results = results;
	}


	//getters
	public  int getPage() {
		return page;
	}


	//setters
	public  void setPage(int page) {
		this.page = page;
	}


	//getters
	public  String getVersion() {
		return version;
	}


	//setters
	public  void setVersion(String version) {
		this.version = version;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
