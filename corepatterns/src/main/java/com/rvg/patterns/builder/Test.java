package com.rvg.patterns.builder;

/**
 * The Test class demonstrates the usage of the HttpClient class with the builder pattern.
 */
public class Test {

    /**
     * The main method is the entry point of the application.
     * It creates an instance of HttpClient using the HttpClientBuilder.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create an HttpClient instance using the builder pattern
        HttpClient client = new HttpClient.HttpClientBuilder()
                .url("http://test.com") // Set the URL
                .method("GET") // Set the HTTP method
                .body("{}") // Set the request body
                .secure("user", "pass") // Set the security credentials
                .build(); // Build the HttpClient instance

        // Print the HttpClient instance
        System.out.println(client);
    }
}
