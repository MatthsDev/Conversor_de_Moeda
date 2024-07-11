package br.com.conversorMoedas.api;

import br.com.conversorMoedas.model.ExchangeRate;
import br.com.conversorMoedas.util.JSONParser;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverterClient {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "4cd92c61f17803d371cd51b5";

    public ExchangeRate getExchangeRate(String baseCurrency) throws IOException, InterruptedException {
        String urlString = API_URL + API_KEY + "/latest/" + baseCurrency;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String json = response.body();
            return JSONParser.parseExchangeRate(json);
        } else {
            throw new IOException("Failed to get exchange rate data. Response Code: " + response.statusCode());
        }
    }
}
