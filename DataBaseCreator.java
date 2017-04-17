/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmbd.pharmacie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Thierno M. B. DIALLO
 */
public class DataBaseCreator {
    
    	
	public String userName = "root" ;
	public String passWord = "" ;
	
	public DataBaseCreator() {}
	
	public DataBaseCreator(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	@SuppressWarnings("finally")
	public Connection getConnection() throws Exception {
		String url = DataBaseConf.URL+DataBaseConf.DBNAME;
		Connection connect = null;		
		try{
		Class.forName(DataBaseConf.DRIVE);
		connect = DriverManager.getConnection(url,DataBaseConf.USERNAME,DataBaseConf.PASSWORD);
		}catch(Exception e){
			throw e;
		}
		finally {
			return connect;
		}
	}
	
	
	private static Connection createMysqlDatabase(Connection con, String user, String pass, String nomBase)  
            throws SQLException{ 
		Connection connection = null; 
		Statement statement = null; 
		try{ 
		statement = con.createStatement(); 
		statement.execute("CREATE DATABASE "+nomBase); 
		String url = con.getMetaData().getURL(); 
		url = url.substring(0,url.lastIndexOf("/")); 
		url += "/"+nomBase; 
		connection = DriverManager.getConnection(url,user,pass); 
		}catch(SQLException e){ 
		SQLException sqle = new SQLException("Création de la base impossible"); 
		sqle.setNextException(e); 
		throw sqle; 
		}finally{ 
		try{statement.close();}catch(Exception e){} 
		} 
		return connection; 
	}
	
	
	private boolean createDB(String pharmaName) throws Exception{
		Connection con = getConnection();
		createMysqlDatabase(con, this.userName, this.passWord, pharmaName);
		return true;
	}
	
	private boolean createTables(String pharmaName) throws Exception{
		TmbdRequests sq = new TmbdRequests(pharmaName);
		Statement stm = sq.seConnecter();
	
		
		String s = new String();
        StringBuffer sb = new StringBuffer();
 
        try
        {
            FileReader fr = new FileReader(new File(DataBaseConf.FILENAME));
 
            BufferedReader br = new BufferedReader(fr);
 
            while((s = br.readLine()) != null)
            {
                sb.append(s);
            }
            br.close();

            String[] inst = sb.toString().split(";");

            for(int i = 0; i<inst.length; i++)
            {

                if(!inst[i].trim().equals(""))
                {
                	stm.executeUpdate(inst[i]);
                    System.out.println(">>"+inst[i]);
                }
            }
   
        }
        catch(Exception e)
        {
            System.out.println("*** Error : "+e.toString());
            System.out.println("*** ");
            System.out.println("*** Error : ");
            e.printStackTrace();
            System.out.println("################################################");
            System.out.println(sb.toString());
        }
		return true;	
	}
	
	public boolean createPharmacie(String pharmaName){
		pharmaName = "pharmacie_"+pharmaName;
		boolean ok = false;
		try {
			 ok = createDB(pharmaName);
			if (ok) ok = createTables(pharmaName);
		} catch (Exception e) {
			e.printStackTrace();			
		}	
		return ok;
	}

    
}
