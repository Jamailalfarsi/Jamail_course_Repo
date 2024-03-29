package randomUserApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class GetRequest {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://randomuser.me/api/"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

    //  System.out.println( response.body());
        Gson gosonObj=new Gson();
        UserApi userObj=gosonObj.fromJson(response.body().toString(), UserApi.class);
        System.out.println(userObj.getInfo().getPage());
        System.out.println(userObj.getResults().get(0).getName());
        System.out.println(userObj.getInfo().getResults());
       System.out.println(userObj.getResults().get(0).getEmail());
       System.out.println(userObj.getResults().get(0).getPhone());
        	
    }
}
