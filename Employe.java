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
public class Employe {

    private int idEmp;
    private String nomEmp;
    private String prenomEmp;
    private String loginEmp;
    private String pwdEmp;

    public Employe() {
        idEmp = 0;
        nomEmp = null;
        prenomEmp = null;
        loginEmp = null;
        pwdEmp = null;
    }

    public Employe(int id, String nom, String prenom, String login, String pwd) {
        idEmp = id;
        nomEmp = nom;
        prenomEmp = prenom;
        loginEmp = login;
        pwdEmp = pwd;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public String getPrenomEmp() {
        return prenomEmp;
    }

    public String getLoginEmp() {
        return loginEmp;
    }

    public String getPwdEmp() {
        return pwdEmp;
    }

    public void setIdEmp(int id) {
        idEmp = id;
    }

    public void setNomEmp(String nom) {
        nomEmp = nom;
    }

    public void setPrenomEmp(String prenom) {
        prenomEmp = prenom;
    }

    public void setLoginEmp(String login) {
        loginEmp = login;
    }

    public void setPwdEmp(String pwd) {
        pwdEmp = pwd;
    }
}
