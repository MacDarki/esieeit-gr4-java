package com.esiee.bibliotheque.controller;


public class Livre {
    String titre, auteur, presentation, parution;
    int colonne, rangee;

    public Livre(String titre, String auteur, String presentation, String parution, int colonne, int rangee) {
        this.titre = titre;
        this.auteur = auteur;
        this.presentation = presentation;
        this.parution = parution;
        this.colonne = colonne;
        this.rangee = rangee;
    }

    // Getter
    public int getColonne() {
        return colonne;
    }

    public int getRangee() {
        return rangee;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getPresentation() {
        return presentation;
    }

    public String getParution() {
        return parution;
    }

    // Setter
    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public void setRangee(int rangee) {
        this.rangee = rangee;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public void setParution(String parution) {
        this.parution = parution;
    }
}



