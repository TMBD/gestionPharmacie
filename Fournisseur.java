/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpharmacie;

/**
 *
 * @author MT98
 */
public class Fournisseur {

    private int idFournisseur;
    private String nomFournisseur;

    public Fournisseur() {
        idFournisseur = 0;
        nomFournisseur = null;
    }

    public Fournisseur(int id, String nom) {
        idFournisseur = id;
        nomFournisseur = nom;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setIdFournisseur(int id) {
        idFournisseur = id;
    }

    public void setNomFournisseur(String nom) {
        nomFournisseur = nom;
    }
}
