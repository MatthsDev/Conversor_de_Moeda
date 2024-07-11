package br.com.conversorMoedas.main;

import br.com.conversorMoedas.service.CurrencyConverterService;
import br.com.conversorMoedas.util.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        CurrencyConverterService converterService = new CurrencyConverterService();
        boolean running = true;

        while (running) {
            int choice = menu.showMainMenu();

            if (choice == 7) {
                running = false;
            } else {
                String[] currencies = menu.getCurrencies(choice);
                converterService.convertCurrency(currencies[0], currencies[1]);

                System.out.print("Deseja fazer outra conversão? (S/N): ");
                String again = menu.getDecision();

                if (!again.equalsIgnoreCase("S")) {
                    running = false;
                }
            }
        }

        menu.closeScanner();
        converterService.closeScanner();
    }
}
