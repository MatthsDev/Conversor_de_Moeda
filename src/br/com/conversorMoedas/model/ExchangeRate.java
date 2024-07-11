package br.com.conversorMoedas.model;

import java.util.Map;

public class ExchangeRate {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public ExchangeRate(String base_code, Map<String, Double> conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getRates() {
        return conversion_rates;
    }
}
