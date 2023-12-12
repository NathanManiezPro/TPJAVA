package fr.nathan.tp1.exercice3;

public class Palindrome {
    public static boolean estUnPalindrome(int nombre){
        Exception(nombre);
        int renverse = 0;
        int decompte = nombre;

        while (decompte !=0){
            int reste = decompte % 10;

            renverse = renverse * 10 + reste;

            decompte /=10;
        }
        if (nombre == renverse){
            return true;
        }else {
            return false;
        }

    }

    private static void Exception(int nombre) {
        if(nombre < 10){
            throw new IllegalArgumentException("Le nombre doit contenir au moins 2 chiffres");
        }
    }

}
