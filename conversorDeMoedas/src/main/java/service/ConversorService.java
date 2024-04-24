package service;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConversorService {

    // Setting URL
    String url_str = "";

    // Making Request
    URL url = new URL(url_str);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();

    public HttpURLConnection getRequest() {
        return request;
    }

    // Convert to JSON
    JsonParser jp = new JsonParser();
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
    JsonObject jsonobj = root.getAsJsonObject();

    // Accessing object
    String req_result = jsonobj.get("result").getAsString();
    public ConversorService() throws IOException, IOException {
    }
}
