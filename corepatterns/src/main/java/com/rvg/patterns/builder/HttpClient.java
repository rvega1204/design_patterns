/**
 * The HttpClient class represents an HTTP client that can be configured using the builder pattern.
 * It allows setting various properties such as URL, method, body, user credentials, and headers.
 * @author rvega
 */
package com.rvg.patterns.builder;

public class HttpClient {

    private String url;
    private String method;
    private String body;
    private String userName;
    private String password;
    private String headers;

    /**
     * Constructs an HttpClient instance using the provided builder.
     *
     * @param builder the builder used to configure the HttpClient instance
     */
    public HttpClient(HttpClientBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.userName = builder.userName;
        this.password = builder.password;
        this.headers = builder.headers;
    }

    /**
     * Returns a string representation of the HttpClient instance.
     *
     * @return a string representation of the HttpClient instance
     */
    @Override
    public String toString() {
        return "HttpClient {" +
                "url = '" + url + '\'' +
                ", method = '" + method + '\'' +
                ", body = '" + body + '\'' +
                ", userName = '" + userName + '\'' +
                ", password = '" + password + '\'' +
                ", headers = '" + headers + '\'' +
                '}';
    }

    /**
     * The HttpClientBuilder class is used to build and configure an HttpClient instance.
     */
    public static class HttpClientBuilder {
        private String url;
        private String method;
        private String body;
        private String userName;
        private String password;
        private String headers;

        /**
         * Sets the URL for the HttpClient.
         *
         * @param url the URL to set
         * @return the current instance of HttpClientBuilder
         */
        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the HTTP method for the HttpClient.
         *
         * @param method the HTTP method to set
         * @return the current instance of HttpClientBuilder
         */
        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * Sets the body for the HttpClient.
         *
         * @param body the body to set
         * @return the current instance of HttpClientBuilder
         */
        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Sets the user credentials for the HttpClient.
         *
         * @param userName the username to set
         * @param password the password to set
         * @return the current instance of HttpClientBuilder
         */
        public HttpClientBuilder secure(String userName, String password) {
            this.userName = userName;
            this.password = password;
            return this;
        }

        /**
         * Sets the headers for the HttpClient.
         *
         * @param headers the headers to set
         * @return the current instance of HttpClientBuilder
         */
        public HttpClientBuilder headers(String headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Builds and returns an HttpClient instance configured with the current builder settings.
         *
         * @return a new HttpClient instance
         */
        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    /**
     * Returns the URL of the HttpClient.
     *
     * @return the URL of the HttpClient
     */
    public String getUrl() {
        return url;
    }

    /**
     * Returns the HTTP method of the HttpClient.
     *
     * @return the HTTP method of the HttpClient
     */
    public String getMethod() {
        return method;
    }

    /**
     * Returns the body of the HttpClient.
     *
     * @return the body of the HttpClient
     */
    public String getBody() {
        return body;
    }

    /**
     * Returns the username of the HttpClient.
     *
     * @return the username of the HttpClient
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Returns the password of the HttpClient.
     *
     * @return the password of the HttpClient
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the headers of the HttpClient.
     *
     * @return the headers of the HttpClient
     */
    public String getHeaders() {
        return headers;
    }
}
