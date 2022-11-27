package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class IncludingExcludingFields {
	
	public void includingExcludingFields() throws IOException, InterruptedException {
		
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create("https://randomuser.me/api/?inc=gender,name,nat"))
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
	    
	   // if (userObject.getResults().get(0).getNat()= null) {
	   System.out.println("The Nationality is: "+ userObject.getResults().get(0).getNat());
	    //}
	   System.out.println("The Cell is: "+ userObject.getResults().get(0).getCell());
	   System.out.println("The Email is: "+ userObject.getResults().get(0).getEmail());
	   System.out.println("The Gender is: "+ userObject.getResults().get(0).getGender());
	   System.out.println("The Phone is: "+ userObject.getResults().get(0).getPhone());
	   System.out.println("The Name is: "+ userObject.getResults().get(0).getName().getTitle()+"\t"+userObject.getResults().get(0).getName().getFirst()+"\t"+userObject.getResults().get(0).getName().getLast());
	   System.out.println("The State is: "+ userObject.getResults().get(0).getLocation().getState());
	   System.out.println("The Country is: "+ userObject.getResults().get(0).getLocation().getCountry());
	   System.out.println("The Postcode is: "+ userObject.getResults().get(0).getLocation().getPostcode());
	   System.out.println("The Street is: "+ userObject.getResults().get(0).getLocation().getStreet().getName()+"\t"+userObject.getResults().get(0).getLocation().getStreet().getNumber());
	   System.out.println("The Latitude is: "+ userObject.getResults().get(0).getLocation().getCoordinates().getLatitude());
	   System.out.println("The Longitude is: "+ userObject.getResults().get(0).getLocation().getCoordinates().getLongitude());
	   System.out.println("The Description is: "+ userObject.getResults().get(0).getLocation().getTimezone().getDescription());
	   System.out.println("The Offset is: "+ userObject.getResults().get(0).getLocation().getTimezone().getOffset());
	   
	   
	   




	}
	    	
		
		


}
