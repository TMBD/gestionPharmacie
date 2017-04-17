/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpharmacie;

import java.sql.*;

/**
 *
 * @author MT98
 */
public class ConnectionToDatabase {

    String urlPilote = "com.mysql.jdbc.Driver";
    String urlDatabase = "jdbc:mysql://localhost:3306/pharmacie_db";
    Connection con;

    public ConnectionToDatabase() {
        try {
            Class.forName(urlPilote);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        try {
            con = DriverManager.getConnection(urlDatabase, "root", "");
            System.out.println("connexion à la base de données réussie");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    Connection getConnectionToDatabase() {
        return con;
    }
}
