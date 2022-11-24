package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class MultipleUserPaginationPasswordSeed {
	
		static void menueFunction() {
			
			System.out.println("____________________________________________");
			
			System.out.println("Select one of the options:");
			System.out.println("1.Multiple user ");
			System.out.println("2.Pagination ");
			System.out.println("3. Passwords");
			System.out.println("4.seeding");
			
			System.out.println("____________________________________________");
		}
	
	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws IOException, InterruptedException {
			 Scanner sc = new Scanner(System.in);
			 do {
				 menueFunction();
					//SubMenue menue2=new SubMenue();
					//menue2.submenueFunction();

					int Menue = sc.nextInt();
					switch(Menue) {
					case 1:
						
						RequestMulltipleUser userRequest=new RequestMulltipleUser();
						 userRequest.mulltipleUser();

						break;
					case 2:
						
						Pagination paginationRequest=new Pagination();
						paginationRequest. paginationAPI();
					
						break;
					case 3:
						Password passwordRequest=new Password();
						passwordRequest.PasswordUser();
						
					break;
					case 4:
						Seeding seedRequest=new Seeding();
						seedRequest.seedUser();
						
					break;
					
				}
					}while(true);
		
                 
		      //  HttpClient client = HttpClient.newHttpClient();
		       //HttpRequest request = HttpRequest.newBuilder()
		               // .uri(URI.create("https://randomuser.me/api/?page=3&results=5&seed=abcj&password=upper,lower,1-16"))
		              //  .build();

		       // HttpResponse<String> response = client.send(request,
		             //   HttpResponse.BodyHandlers.ofString());

		       // System.out.println("The JSON of the selected is :"+ response.body());
		        
		      // Gson gosonObj=new Gson();
		       // UserApi userObj=gosonObj.fromJson(response.body().toString(), UserApi.class);
		      //  System.out.println("The Page is "+userObj.getInfo().getPage());
		       // System.out.println("The seed is:"+ userObj.getInfo().getSeed());
		      //  System.out.println("The results is"+" "+userObj.getInfo().getResults());
		       //System.out.println(userObj.getResults().get(4).getEmail());
		       //System.out.println(userObj.getResults().get(0).getPhone());
		      // System.out.println("The password generated is: "+ userObj.getResults().get(0).getLogin().getPassword());	

	}

}
