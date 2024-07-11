package br.com.conversorMoedas.util;

import br.com.conversorMoedas.model.ExchangeRate;
import com.google.gson.Gson;

import java.util.Map;

public class JSONParser {
    public static ExchangeRate parseExchangeRate(String jsonString) {
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(jsonString, Map.class);

        String base = (String) map.get("base_code");
        Map<String, Double> rates = (Map<String, Double>) map.get("conversion_rates");

        return new ExchangeRate(base, rates);
    }
}