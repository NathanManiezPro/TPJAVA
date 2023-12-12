package fr.nathan.tp1.exercice5;
import java.util.HashMap;
public class Convertisseur {

    public static int versionCascadeDeIf(String nombreRomain){
        if(nombreRomain.length() > 15 ){
            throw new IllegalArgumentException("Le nombre romain ne peut pas excéder 15 caractères");
        }
        int nombreArabe =0;
        for(int i = 0; i < nombreRomain.length();i++){
            if(nombreRomain.charAt(i)=='I'){
                nombreRomain+=1;

            }else if (nombreRomain.charAt(i) == 'V'){
                if(i > 0 && nombreRomain.charAt(i-1) == 'I'){
                    nombreArabe+= 3;
                }else {
                    nombreArabe +=5;
                }
            }
        }
    return nombreArabe;}
}
