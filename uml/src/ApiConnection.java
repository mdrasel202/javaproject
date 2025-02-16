//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//
//import java.io.IOException;
//
//public class ApiConnection {
//    public class Test {
//        public static void main(String[] args) {
//            OkHttpClient client = new OkHttpClient();  // OkHttpClient is used to make the HTTP request.
//
//            // Request for generating UUIDs with the specified count (10 in this case)
//            Request request = new Request.Builder()
//                    .url("https://www.uuidtools.com/api/generate/v4/count/10") // API endpoint URL
//                    .get() // Use GET method, since you're retrieving data, not sending data
//                    .build();
//
//            try {
//                // Execute the request and get the response
//                Response response = client.newCall(request).execute();
//
//                // Check if the request was successful
//                if (response.isSuccessful()) {
//                    // Output the response body (i.e., the generated UUIDs)
//                    System.out.println(response.body().string());
//                } else {
//                    System.out.println("Request failed. Response code: " + response.code());
//                }
//
//            } catch (IOException e) {
//                // Handle any errors that might occur during the request
//                e.printStackTrace();
//            }
//        }
//    }
//}
