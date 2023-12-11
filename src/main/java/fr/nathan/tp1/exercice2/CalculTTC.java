package fr.nathan.tp1.exercice2;

import java.util.Scanner;

public class CalculTTC {
    public static double calculTVA() throws IllegalAccessException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un prix HorsTaxe");
        double prixHorsTaxe = scanner.nextDouble();
        if (prixHorsTaxe < 0){
            throw new IllegalAccessException(" Il faut que que le prix soit positif");
        }
        double tva =1.20;
        double prixTTC = prixHorsTaxe * tva;

        System.out.println("Le prix après la TVA est de " + prixTTC);
        return prixTTC;
    }
}
