package fr.nathan;
import fr.nathan.tp1.exercice1.moyenne;
import fr.nathan.tp1.exercice2.CalculTTC;
import fr.nathan.tp1.exercice3.Palindrome;
import fr.nathan.tp1.exercice4.Doublon;
import fr.nathan.tp1.exercice5.Convertisseur;
import fr.nathan.tp2.Thermometre;

import java.util.HashMap;

public class Main {
    public static void main(String[]args)throws IllegalAccessException{
        // ex1
        /*
        double[] notes = {13,10,12};
        System.out.println(moyenne.calculerMoyenne(notes));
         */

        //ex2
        //System.out.println(CalculTTC.calculTVA());

        //ex3
        //System.out.println(Palindrome.estUnPalindrome(121));

        //ex4
        /*
        int[] listesSansDoublon = {1,2,3,4,5,6,8,9,10 };
        Doublon unDoublon = new Doublon(listesSansDoublon);
        int[] listesAvecDoublon = {1,2,3,4,5,6,8,10,10 };
        Doublon unDoublon2 = new Doublon(listesAvecDoublon);

         */
    //ex5
        /*
        Map<Character, Integer> nombresRomains = new HashMap<>();

        nombresRomains.put('I', 1);
        nombresRomains.put('V', 5);
        nombresRomains.put('X', 10);
        nombresRomains.put('L', 50);
        nombresRomains.put('C', 100);
        nombresRomains.put('D', 500);
        nombresRomains.put('M', 1000);

         */
        Thermometre ThermometreClassique = new Thermometre();
        Thermometre ThermometreAutre = new Thermometre(122);
        System.out.println("Le thermomètre en Fahrenheit affiche " + ThermometreClassique.getFahrenheit());
        System.out.println("Le thermomètre classique affiche " + ThermometreAutre.getCelsius());
    }
}
