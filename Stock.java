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
public class Stock {

    private int idStock;
    private String libelleStock;
    private int quantite;
    private float prixUnitaire;

    public Stock() {
        idStock = 0;
        libelleStock = null;
        quantite = 0;
        prixUnitaire = 0;
    }

    public Stock(int id, String libelle, int quant, float prix) {
        idStock = id;
        libelleStock = libelle;
        quantite = quant;
        prixUnitaire = prix;
    }

    public int getIdStock() {
        return idStock;
    }

    public String getLibelleStock() {
        return libelleStock;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setIdStock(int id) {
        idStock = id;
    }

    public void setLibelleStock(String libelle) {
        libelleStock = libelle;
    }

    public void setQuantite(int quant) {
        quantite = quant;
    }

    public void setPrixUnitaire(int prix) {
        prixUnitaire = prix;
    }
}
