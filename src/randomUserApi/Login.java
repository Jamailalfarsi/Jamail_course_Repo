package randomUserApi;

import java.io.Serializable;

public class Login implements Serializable  {
	private String uuid;
	private String username;
	private String pasword;
	private String salt;
	private String md5;
	private String sha1;
	private String sha256;
	//getters
	public String getUuid() {
	return uuid;
}
//setters
	public void setUuid(String uuid) {
	this.uuid = uuid;
}
//getters
	public String getUsername() {
	return username;
}
//setters
	public void setUsername(String username) {
	this.username = username;
}
//getters
	public String getPasword() {
	return pasword;
}
//setters
	public void setPasword(String pasword) {
	this.pasword = pasword;
}
//getters
	public String getSalt() {
	return salt;
}
//setters
	public void setSalt(String salt) {
	this.salt = salt;
}
//getters
	public String getMd5() {
	return md5;
}
//setters
	public void setMd5(String md5) {
	this.md5 = md5;
}
//getters
	public String getSha1() {
	return sha1;
}
//setters
	public void setSha1(String sha1) {
	this.sha1 = sha1;
}
//getters
	public String getSha256() {
	return sha256;
}
//setters
	public void setSha256(String sha256) {
	this.sha256 = sha256;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
