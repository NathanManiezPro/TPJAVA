package fr.nathan.demos.interfaces;

import java.time.LocalDate;

public abstract class Collaborateur implements Personne{
    protected String nom;
    protected String prenom;
    protected LocalDate dateDebutContrat;
    protected LocalDate dateDeFinContrat;

    public LocalDate getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public LocalDate getDateDeFinContrat() {
        return dateDeFinContrat;
    }

    public void setDateDeFinContrat(LocalDate dateDeFinContrat) {
        this.dateDeFinContrat = dateDeFinContrat;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getPrenom() {
        return this.prenom;
    }

    @Override
    public String getNomComplet() {
        return this.nom + " " + this.prenom;
    }

    @Override
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    @Override
    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }


    public void licencier(LocalDate dateDeFin) {
        this.dateDeFinContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + "est viré. LOL");
    }

    /**
     * Le collaborateur travaille
     */
    public void travailler(){
        System.out.println(this.getNom() + " " + this.getPrenom() + " ");
    }


    /**
     * Vérifie si le collabo est dans les effectifs
     * @return boolean true s'il est encore dans l'effectif.
     */
    protected boolean estDansLesEffectifs(){
        return !(this.dateDeFinContrat != null && this.dateDeFinContrat.isBefore(LocalDate.now()));
    }

}
