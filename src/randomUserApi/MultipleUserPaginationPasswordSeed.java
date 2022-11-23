package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class MultipleUserPaginationPasswordSeed {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws IOException, InterruptedException {

		        HttpClient client = HttpClient.newHttpClient();
		        HttpRequest request = HttpRequest.newBuilder()
		                .uri(URI.create("https://randomuser.me/api/?page=3&results=5&seed=abcj&password=upper,lower,1-16"))
		                .build();

		        HttpResponse<String> response = client.send(request,
		                HttpResponse.BodyHandlers.ofString());

		        System.out.println("The JSON of the selected is :"+ response.body());
		        
		        Gson gosonObj=new Gson();
		        UserApi userObj=gosonObj.fromJson(response.body().toString(), UserApi.class);
		        System.out.println("The Page is "+userObj.getInfo().getPage());
		        System.out.println("The seed is:"+ userObj.getInfo().getSeed());
		        System.out.println("The results is"+" "+userObj.getInfo().getResults());
		       //System.out.println(userObj.getResults().get(4).getEmail());
		       //System.out.println(userObj.getResults().get(0).getPhone());
		       System.out.println("The password generated is: "+ userObj.getResults().get(0).getLogin().getPassword());	

	}

}
