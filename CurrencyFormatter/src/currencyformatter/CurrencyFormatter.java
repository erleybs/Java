/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currencyformatter;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Unesp
 */
public class CurrencyFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale brasilLocale = new Locale.Builder()
                                .setLanguage("pt")
                                .setRegion("BR")
                                .build();
         // Exemplo de valor
        double valor = 1012357.99;

        // Usando Locale.of para criar a instância de Locale
        //[ebs] NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR")); // foi depreciado na versão 19

        // Usando Locale.forLanguageTag para criar a instância de Locale
        //[ebs] NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
        
        // Usando Locale.Builder para criar a instância de Locale
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(brasilLocale);

        String valorFormatado = numberFormat.format(valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
    
}
