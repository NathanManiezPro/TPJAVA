package fr.nathan.demos.interfaces;

import java.time.LocalDate;

public class Stagiaire extends Collaborateur implements Renouvelable{


    @Override
    public void prolongerContrat(LocalDate nouvelleDateDeFin) {
        this.dateDeFinContrat = nouvelleDateDeFin;
    }
}
