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
public class Gerant {

    private int idGerant;
    private String nomGerant;
    private String prenomGerant;
    private String loginGerant;
    private String pwdGerant;

    public Gerant() {
        idGerant = 0;
        nomGerant = null;
        prenomGerant = null;
        loginGerant = null;
        pwdGerant = null;
    }

    public Gerant(int id, String nom, String prenom, String login, String pwd) {
        idGerant = id;
        nomGerant = nom;
        prenomGerant = prenom;
        loginGerant = login;
        pwdGerant = pwd;
    }

    public int getIdGerant() {
        return idGerant;
    }

    public String getNomGerant() {
        return nomGerant;
    }

    public String getPrenomGerant() {
        return prenomGerant;
    }

    public String getLoginGerant() {
        return loginGerant;
    }

    public String getPwdGerant() {
        return pwdGerant;
    }

    public void setIdGerant(int id) {
        idGerant = id;
    }

    public void setNomGerant(String nom) {
        nomGerant = nom;
    }

    public void setPrenomGerant(String prenom) {
        prenomGerant = prenom;
    }

    public void setLoginGerant(String login) {
        loginGerant = login;
    }

    public void setPwdGerant(String pwd) {
        pwdGerant = pwd;
    }
}
