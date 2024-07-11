package br.com.conversorMoedas.util;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int showMainMenu() {
        System.out.println("******************************************");
        System.out.println();
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
        System.out.println();
        System.out.println("******************************************");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileiro");
        System.out.println("4) Real brasileiro => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Sair");
        System.out.print("Escolha uma opção válida: ");
        return scanner.nextInt();
    }

    public String[] getCurrencies(int choice) {
        String baseCurrency = "";
        String targetCurrency = "";

        switch (choice) {
            case 1:
                baseCurrency = "USD";
                targetCurrency = "ARS";
                break;
            case 2:
                baseCurrency = "ARS";
                targetCurrency = "USD";
                break;
            case 3:
                baseCurrency = "USD";
                targetCurrency = "BRL";
                break;
            case 4:
                baseCurrency = "BRL";
                targetCurrency = "USD";
                break;
            case 5:
                baseCurrency = "USD";
                targetCurrency = "COP";
                break;
            case 6:
                baseCurrency = "COP";
                targetCurrency = "USD";
                break;
            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                break;
        }

        return new String[]{baseCurrency, targetCurrency};
    }

    public String getDecision() {
        return scanner.next();
    }

    public void closeScanner() {
        scanner.close();
    }
}
