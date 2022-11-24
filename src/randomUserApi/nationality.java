package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class nationality {
	
	public void userNationality() throws IOException, InterruptedException {
	
	HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://randomuser.me/api/?nat"))
            .build();

    HttpResponse<String> response = client.send(request,
            HttpResponse.BodyHandlers.ofString());
    HttpResponse<String>Response=null;
  
  try {
 	 
 	 response=HttpClient.newHttpClient().send(request,  HttpResponse.BodyHandlers.ofString());
  }catch(IOException e){
 	 e.printStackTrace();
 	 
  }catch(InterruptedException e){
 	 e.printStackTrace();
 	 
  }
  
  System.out.println(response.body());
  
    Gson gosonObj=new Gson();
    UserApi userObject=gosonObj.fromJson(response.body().toString(), UserApi.class);
    
   System.out.println("The Nationality is: "+ userObject.getResults().get(0).getNat());
	}
    	
	
	

	
}
