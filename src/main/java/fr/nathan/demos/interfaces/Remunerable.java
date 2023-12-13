package fr.nathan.demos.interfaces;

public interface Remunerable {
    /**
     * Nombres d'heures travaillés pendant un mois,
     * pour une personne à 35h qui n'a pas été malade
     * et n'a pas fait d'heures supp
     */
    public static final int NOMBRE_HEURES_MENSUELLES_NORMAL =151;
    /**
     * Paie un salarié en fonction de son taux horaire
     * @param heures double - Nombres d'heures travaillés
     */
    public void payer(double heures);

    /**
     * Paie un salarié en fonction de son taux horaires,sur une base de 151 heures
     */
    public void payer();
    public double getTauxHoraire();
    public double calculerRemunerationHeuresSupplementaires(double heuresTravaillees);
}
