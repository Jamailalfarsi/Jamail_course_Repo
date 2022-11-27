package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class RequestMulltipleUser {

	public void mulltipleUser()throws IOException, InterruptedException {
//	public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.out.println("How many user you want?");
		
		 for(int i=0;i<=5;i++) {
      
			 HttpClient client = HttpClient.newHttpClient();
		        HttpRequest request = HttpRequest.newBuilder()
		                .uri(URI.create("https://randomuser.me/api/?results=5"))
		                .build();

		        HttpResponse<String> response = client.send(request,
		                HttpResponse.BodyHandlers.ofString());

		    //    System.out.println("The JSON of the selected is :"+ response.body());
		      //  HttpResponse<String>Response=null;
		        
		        try {
		       	 
		       	 response=HttpClient.newHttpClient().send(request,  HttpResponse.BodyHandlers.ofString());
		        }catch(IOException e){
		       	 e.printStackTrace();
		       	 
		        }catch(InterruptedException e){
		       	 e.printStackTrace();
		       	 
		        }
		        
		        System.out.println(response.body());
		        
		        System.out.println("***************************************");
		        
		      //  for(int i=0;i<=5;i++) {
		        Gson gosonObj=new Gson();
		        UserApi userObj=gosonObj.fromJson(response.body().toString(), UserApi.class);
		        System.out.println("page:\t"+userObj.getInfo().getPage());
		        System.out.println("Results:\t"+userObj.getInfo().getResults());
		       System.out.println("Email:\t"+userObj.getResults().get(0).getEmail());
		       System.out.println("Phone:\t"+userObj.getResults().get(0).getPhone());
		       
		       System.out.println("***************************************");
		        }
	      
}

}





