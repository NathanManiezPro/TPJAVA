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
        for(int mainIndex = 1; mainIndex<nombres.length; mainIndex++){
            if (nombres[mainIndex] == nombres[mainIndex-1]){
                return true;
            }
        }
        return false;
    }
}


