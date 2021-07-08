package com.getPost;

public class Adresse {
    private int numRue;
    private String nomRue;
    private String ville;

    /* Getters and Setters*/
    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }



    /* Constructor*/
    public Adresse(int numRue, String nomRue, String ville) {
        this.numRue = numRue;
        this.nomRue = nomRue;
        this.ville = ville;

    }

    // toString adresse

    @Override
    public String toString() {
        return "Adresse{" +
                "numRue=" + numRue +
                ", nomRue='" + nomRue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
