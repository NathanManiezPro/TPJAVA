package fr.nathan.tp1.exercice1;
import java.util.Scanner;

public class moyenne {
    public static double calculerMoyenne(double[] notes) throws IllegalAccessException{

        VerifierNombreNotes(notes);
        for (double note :notes){
            if(note<0 || note >20){
                throw new IllegalAccessException("Les notes doivent être comprise en 0 et 20");
            }
        }
        int somme = 0;
        for (double note: notes){
            somme+= note;
        }
        return somme / notes.length;
    }

    private static void VerifierNombreNotes(double[] notes) throws IllegalAccessException {
        if (notes.length !=3){
            throw new IllegalAccessException(" Il doit y avoir 3 notes !!");
        }
    }


}