package fr.nathan;
import fr.nathan.tp1.exercice1.moyenne;
import fr.nathan.tp1.exercice2.CalculTTC;
import fr.nathan.tp1.exercice3.Palindrome;
import fr.nathan.tp1.exercice4.Doublon;

public class Main {
    public static void main(String[]args)throws IllegalAccessException{
        // ex1
        //double[] notes = {13,10,12};
        //System.out.println(moyenne.calculerMoyenne(notes));

        //ex2
        //System.out.println(CalculTTC.calculTVA());

        //ex3
        //System.out.println(Palindrome.estUnPalindrome(121));

        //ex4
        int[] listesSansDoublon = {1,2,3,4,5,6,8,9,10 };
        Doublon unDoublon = new Doublon(listesSansDoublon);
        int[] listesAvecDoublon = {1,2,3,4,5,6,8,10,10 };
        Doublon unDoublon2 = new Doublon(listesAvecDoublon);
    }
}
