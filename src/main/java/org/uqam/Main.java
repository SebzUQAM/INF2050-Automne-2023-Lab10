package org.uqam;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }

    private static double taxeFederale = 0.05;
    private static double taxeProvinciale = 0.09975;
    public static long calculerTaxes(long montantEnSous, boolean taxeFederale, boolean taxeProvinciale){
        if(montantEnSous <= 0){
            throw new IllegalArgumentException("Le montantEnSous ne peut pas être 0 ou inférieur.");
        }

        double resultat = montantEnSous;
        resultat += montantEnSous * (taxeFederale ? Main.taxeFederale : 0);
        resultat += montantEnSous * (taxeProvinciale ? Main.taxeProvinciale : 0);

        return Math.round(resultat);
    }
}