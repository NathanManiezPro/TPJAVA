package fr.nathan.tp1.exercice4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Doublon {
    private int [] nombres;
    public Doublon (int [] nombres){
        this.nombres = nombres;
        if(trier(nombres)){
            System.out.println("Il y a un doublon " + nombres);
        }else{
            System.out.println("Il n'y a pas de doublon ");
        }
    }
    /*public static boolean verifDoublon(int [] nombres){

        for(int mainIndex = 0; mainIndex<nombres.length; mainIndex++){
            for(int comparaisonIndex = mainIndex + 1 ; comparaisonIndex< nombres.length;comparaisonIndex++){
                if (nombres[mainIndex] == nombres[comparaisonIndex]){
                    return true;
                }

            }

        }
    return false;
    }

     */
    public static boolean trier(int[] nombres){

        Arrays.sort(nombres);
        // On peut parcourir en partant du second élément
        for(int mainIndex = 1; mainIndex<nombres.length; mainIndex++){
            //On compare avec l'élément précédent
            if (nombres[mainIndex] == nombres[mainIndex-1]){
                // Et return true si les 2 sont égaux
                return true;
            }
        }
        return false;
    }
}


