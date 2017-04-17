/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpharmacie;

import com.tmbd.pharmacie.TmbdRequests;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author MT98
 */
public class ListeFonctions {

    public ResultSet getData(String request) {
        Statement stmt;
        ResultSet resultat;
        ConnectionToDatabase con = new ConnectionToDatabase();
        try {
            stmt = con.getConnectionToDatabase().createStatement();
            resultat = stmt.executeQuery(request);
        } catch (SQLException ex) {
            resultat = null;
            System.err.println(ex);
        }
        return resultat;
    }

    public void setData(String request) {
        Statement stmt;
        ConnectionToDatabase con = new ConnectionToDatabase();
        try {
            stmt = con.getConnectionToDatabase().createStatement();
            stmt.executeUpdate(request);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public String whoIsConnected(String login, String pwd,String pharmaName) throws Exception {
        boolean found = false;
        String who = "";
        String requete = "SELECT * FROM admin_t;";
        try {
            ResultSet rs = getData(requete);
            while (rs.next() && found == false) {
                if (login.equals(rs.getString("login")) && pwd.equals(rs.getString("mdp"))) {
                    found = true;
                    who = "admin";
                    return who;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        requete = "SELECT * FROM gerant_t;";
        try {
            ResultSet rs = getData(requete);
            while (rs.next() && found == false) {
                if (login.equals(rs.getString("id")) && pwd.equals(rs.getString("mdp"))) {
                    found = true;
                    who = "gerant";
                    return who;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
               
        try {
            TmbdRequests req = new TmbdRequests("pharmacie_"+pharmaName);
            ResultSet rs = req.queryAllEmployes();
            System.out.println(pharmaName);
            while (rs.next() && found == false) {
                if (login.equals(rs.getString("id")) && pwd.equals(rs.getString("pwd"))) {
                    found = true;
                    who = "employe";
                    return who;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }        
        return "";
    }

    public void ajouterPharmacie(String nomPharm, String adressePharm, String nomGerant, String prenomGerant, String tel, String mail) {
        String login = createLoginGerant(nomGerant, prenomGerant, nomPharm);
        String pwd = createPasswordGerant(nomGerant, prenomGerant, nomPharm);
        String req = "INSERT INTO gerant_t(id, prenom, nom, tel, email, mdp) VALUES ('" + login + "','" + prenomGerant + "','" + nomGerant + "','" + tel + "','" + mail + "','" + pwd + "');";
        setData(req);
        req = "INSERT INTO pharmacie_t(nom, adresse, id_gerant) VALUES ('" + nomPharm + "','" + adressePharm + "','" + login + "');";
        setData(req);
    }

    public String createLoginGerant(String nom, String prenom, String nomPharm) {
        ConnectionToDatabase connexion = new ConnectionToDatabase();
        Statement stmt;
        String requete, mat, initiales;
        int id = 0;
        try {
            stmt = connexion.getConnectionToDatabase().createStatement();
            requete = "SELECT count(*) FROM gerant_t;";
            ResultSet resultat = stmt.executeQuery(requete);
            while (resultat.next()) {
                id = resultat.getInt("count(*)") + 1;
            }

        } catch (SQLException ex) {
            System.err.println();
        }
        initiales = "G" + nom.substring(0, 1).toUpperCase() + prenom.substring(0, 1).toUpperCase();
        mat = initiales + id + nomPharm.substring(0, 1).toUpperCase();
        return mat;
    }

    public String createPasswordGerant(String nom, String prenom, String nomPharm) {
        String code = "";
        prenom = prenom.toUpperCase();
        nom = nom.toUpperCase();
        nomPharm = nomPharm.toUpperCase();
        int nb = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        code = prenom.substring(0, 1) + nb + nom.substring(0, 1) + nomPharm.substring(0, 1);

        return code;

    }

    public boolean ifPharmExist(String nom) {
        String req = "SELECT nom FROM pharmacie_t WHERE nom = '" + nom + "';";
        ResultSet rs = getData(req);
        boolean found = false;
        try {
            while (rs.next()) {
                found = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListeFonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return found;
    }

    public boolean formulaireIsFilled(String tab[]) {
        boolean filled = true;
        for (String a : tab) {
            if (a.equals("")) {
                filled = false;
            }
        }
        return filled;
    }

    public boolean formulaireIsFilled2(String tab[], int i) {
        boolean filled = true;
        for (int a = 0; a < i; a++) {
            if (tab[a].equals("")) {
                filled = false;
            }
        }
        return filled;
    }

    public DefaultComboBoxModel chargerComboMultiple(ResultSet rs, String tab[]) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        String element = "";
        try {
            while (rs.next()) {
                for (String e : tab) {
                    element = element + rs.getString(e) + " . ";
                }
                model.addElement(element);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListeFonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public DefaultComboBoxModel chargerComboSingle(ResultSet rs, String colonne) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                model.addElement(rs.getString(colonne));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListeFonctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

}
