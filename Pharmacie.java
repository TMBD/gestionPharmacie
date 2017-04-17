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
public class Pharmacie {

    private int idPharm;
    private String nomPharm;
    private String adressePharm;

    public Pharmacie() {
        idPharm = 0;
        nomPharm = null;
        adressePharm = null;
    }

    public Pharmacie(int id, String nom, String adresse) {
        idPharm = id;
        nomPharm = nom;
        adressePharm = adresse;
    }

    public int getIdPharm() {
        return idPharm;
    }

    public String getNomPharm() {
        return nomPharm;
    }

    public String getAdressePharm() {
        return adressePharm;
    }

    public void setIdPharm(int id) {
        idPharm = id;
    }

    public void setNomPharm(String nom) {
        nomPharm = nom;
    }

    public void setAdressePharm(String adresse) {
        adressePharm = adresse;
    }
}
