import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Create an HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Create an HTTP request to search for "Selenium" on Google
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.com/search?q=Selenium"))
                .GET()
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response status code and body
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
    }
}