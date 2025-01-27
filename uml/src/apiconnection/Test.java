package apiconnection;

import okhttp3.*;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        // Build the GET request (no request body required for GET)
        Request request = new Request.Builder()
                .url("https://www.w3schools.com/")  // API URL
                .get()  // Use GET method without a body
                .build();

        // Execute the request and get the response
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                // Print the response body if the request was successful
                System.out.println("Result : "+response.body().string());
            } else {
                // Print the response code if the request failed
                System.out.println("Request failed. Response code: " + response.code());
            }
        }
    }
}

