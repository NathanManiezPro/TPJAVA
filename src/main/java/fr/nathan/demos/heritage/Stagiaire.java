package fr.nathan.demos.heritage;

import java.time.LocalDate;

public class Stagiaire extends Personne{
    public Stagiaire(String nom,
                     String prenom,
                     LocalDate dateNaissance,
                     LocalDate dateDebutStage,
                     LocalDate dateFinStage
                     ) {
        super(nom, prenom, dateNaissance);
    }
}
