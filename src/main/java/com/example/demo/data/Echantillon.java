package com.example.demo.data;

/**
 * Classe de données qui permet d'encpsulée de données
 *   * Nombre de voitures
 *   * Prix moyen de ce nombre de voiture(s)
 */
public class Echantillon {

    int nombreDeVoitures;
    int prixMoyen;

    public Echantillon(){}

    public Echantillon(int nombreDeVoitures, int prixMoyen) {
        this.nombreDeVoitures = nombreDeVoitures;
        this.prixMoyen = prixMoyen;
    }

    public int getNombreDeVoitures() {
        return nombreDeVoitures;
    }

    public void setNombreDeVoitures(int nombreDeVoitures) {
        this.nombreDeVoitures = nombreDeVoitures;
    }

    public int getPrixMoyen() {
        return prixMoyen;
    }

    public void setPrixMoyen(int prixMoyen) {
        this.prixMoyen = prixMoyen;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Echantillon that = (Echantillon) o;
        return nombreDeVoitures == that.nombreDeVoitures && prixMoyen == that.prixMoyen;
    }
}