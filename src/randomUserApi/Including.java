package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Including {

	public void showIncludeParamter() throws IOException, InterruptedException {
		System.out.println("what you want to appears for user from the choices:");
		System.out.println("___________________________________");
		System.out.println("gender\r\n"
				+ "name\r\n"
				+ "location\r\n"
				+ "email\r\n"
				+ "login\r\n"
				+ "registered\r\n"
				+ "dob\r\n"
				+ "phone\r\n"
				+ "cell\r\n"
				+ "id\r\n"
				+ "picture\r\n"
				+ "nat");
		System.out.println("___________________________________");
		
		
		Scanner sc = new Scanner(System.in);
		String include = sc.next();

		
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://randomuser.me/api/?inc="+include)).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println("THe JSON is :" + response.body());
			Gson GsonObject = new Gson();
			UserApi userObj = GsonObject.fromJson(response.body().toString(), UserApi.class);
			//System.out.println(response.body().formatted(null));
			System.out.println("*************************************************");
           if((userObj.getResults().get(0).getName()!= null)) {
		    System.out.println("The Name is:"+userObj.getResults().get(0).getName().getFirst());
           }
           else if((userObj.getResults().get(0).getNat()!= null)) {
				    	 System.out.println("The Nationality is:"+userObj.getResults().get(0).getNat());
				    }
           else  if((userObj.getResults().get(0).getGender()!= null)) {
		    	 System.out.println("The Gender is:"+userObj.getResults().get(0).getGender());
		   
			
            }
	}
}
		

		
