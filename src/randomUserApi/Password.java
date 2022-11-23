package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class Password {
	public void PasswordUser()throws IOException, InterruptedException {
	// public static void main(String[] args) throws IOException, InterruptedException {

	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("https://randomuser.me/api/?password=CHARSETS,MIN_LENGTH-MAX_LENGTH"))
	                .build();

	        HttpResponse<String> response = client.send(request,
	                HttpResponse.BodyHandlers.ofString());

	        //System.out.println(response.body());
	        Gson gosonObj=new Gson();
	        UserApi userObject=gosonObj.fromJson(response.body().toString(), UserApi.class);
	        System.out.println(userObject.getInfo().getPage());
	        System.out.println(userObject.getResults().get(0).getName());
	        System.out.println(userObject.getInfo().getResults());
	       System.out.println(userObject.getResults().get(0).getEmail());
	       System.out.println(userObject.getResults().get(0).getPhone());
	       System.out.println("The password generated is: "+ userObject.getResults().get(0).getLogin().getPassword());
	        	

	}

}
