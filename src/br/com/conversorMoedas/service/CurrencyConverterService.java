package br.com.conversorMoedas.service;

import br.com.conversorMoedas.api.CurrencyConverterClient;
import br.com.conversorMoedas.model.ExchangeRate;

import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverterService {
    private CurrencyConverterClient client;
    private Scanner scanner;

    public CurrencyConverterService() {
        this.client = new CurrencyConverterClient();
        this.scanner = new Scanner(System.in);
    }

    public void convertCurrency(String baseCurrency, String targetCurrency) {
        try {
            ExchangeRate exchangeRate = client.getExchangeRate(baseCurrency);
            Double rate = exchangeRate.getRates().get(targetCurrency);
            if (rate != null) {
                System.out.printf("A taxa de câmbio de %s para %s é: %.4f%n", baseCurrency, targetCurrency, rate);
                System.out.println();
                System.out.print("Informe o valor em " + baseCurrency + " que deseja converter: ");
                double amount = scanner.nextDouble();
                double convertedAmount = amount * rate;
                System.out.println();
                System.out.printf("%.2f %s equivalem a %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);

            } else {
                System.out.printf("Taxa de câmbio não disponível para %s para %s%n", baseCurrency, targetCurrency);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao obter taxas de câmbio: " + e.getMessage());
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
