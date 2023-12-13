package fr.nathan.demos.exception;

public class GestionExceptionDemo {
    public static void main(String[]args)throws Exception{
        int dividende = 10;
        int diviseur = 0;



        try {
            int resultat = dividende / diviseur;
            System.out.println("Le résultat est " + resultat);
        }
        catch (ArithmeticException e) {
            throw new MonExceptionPerso("C'est pété");
        }
        finally {
            System.out.println("J'ai fais du code ");
        }

    }
}
