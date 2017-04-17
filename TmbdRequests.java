/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmbd.pharmacie;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Thierno M. B. DIALLO
 */
public class TmbdRequests {
    
    	
	public static final String USERNAME = "root";
	public static final String PASSWORD = "";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String DRIVE = "com.mysql.jdbc.Driver";
	
	public String dbName = "pharmacie_db";
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////CONSTRUCTORS///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public TmbdRequests(){}
	
	public TmbdRequests(String bdName){
		this.dbName = bdName;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////MAIN FUNCTIONS////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Statement seConnecter() {
		String url = URL+this.dbName;
		Statement statement = null;		
		try{
		Class.forName(DRIVE);
		Connection connect = DriverManager.getConnection(url,USERNAME,PASSWORD);
		statement = connect.createStatement();
		}catch(Exception e){
			e.printStackTrace();
		}
		return statement;
	}
	
	private ResultSet executeReq(String req, Statement statement) throws Exception{
		return statement.executeQuery(req);	
	}
	
	private int updateReq(String req, Statement statement) throws Exception{
		return statement.executeUpdate(req);
	}
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	private boolean insert(String req) throws Exception{
		boolean ok = false;
		Statement stm = seConnecter();
		int nbMaj = updateReq(req, stm);
		//stm.close();
		if(nbMaj>=1) ok = true;
		return ok;
	}
	
	private ResultSet selectWithCondition(String whatToSelect, String tableName, String condition) throws Exception{
		Statement stm = seConnecter();
		ResultSet result = executeReq("SELECT "+whatToSelect+" FROM "+tableName+" WHERE "+condition, stm);
		//stm.close();
		return result;
	}
	
//********************************************************************************************************
	private ResultSet selectWithoutCondition(String whatToSelect, String tableName) throws Exception{
		Statement stm = seConnecter();
		ResultSet result = executeReq("SELECT "+whatToSelect+" FROM "+tableName, stm);
		//stm.close();
		return result;
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////	

	
	private boolean updateWithCondition(String tableName, String changment, String condition) throws Exception{
		boolean ok = false;
		Statement stm = seConnecter();
		int nbMaj = updateReq("UPDATE "+ tableName +" SET "+changment+" WHERE "+condition, stm);
		if(nbMaj>=1) ok = true;
		//stm.close();
		return ok;
	}
	
//********************************************************************************************************    
	@SuppressWarnings("unused")
	private boolean updateWithoutCondition(String tableName, String changment) throws Exception{
		boolean ok = false;
		Statement stm = seConnecter();
		int nbMaj = updateReq("UPDATE "+ tableName +" SET "+changment, stm);
		if(nbMaj>=1) ok = true;
		//stm.close();
		return ok;
	}
   
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////     MEDICAMENT   ////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//******************************************************************************************************************       
    public boolean insertMedicament(String nom, String pvu, int nb , String nomFamille, float seuilAppro) throws Exception{
    	boolean ok = false;
    	ok = insert("INSERT INTO medicament_t VALUES ('"+nom+"',"+pvu+","+nb+",'"+nomFamille+"',"+seuilAppro+")");      		
    	return ok;
    }
    
        public ResultSet queryAllMedicaments() throws Exception{
        	ResultSet result = null;
        	result = selectWithoutCondition("*", "medicament_t");      		
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryMedicament(String nameMedic) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "medicament_t", "nom='"+nameMedic+"'");
        	return result;
        }

//******************************************************************************************************************       
        public ResultSet queryMedicamentsSeuil(String seuil) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "medicament_t", "seuil_appro="+seuil);
        	return result;
        }
      
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        public boolean updateNbMedicament(String nameMedi, int nb) throws Exception{
        	boolean result = false;
        	result = updateWithCondition("medicament_t", "nb="+nb, "nom='"+nameMedi+"'");
        	
        	return result;
        }
        
//******************************************************************************************************************       
        public boolean updatePvuMedicament(String nameMedi, float newPvu) throws Exception{
        	boolean result = false;
        	result = updateWithCondition("medicament_t", "pvu="+newPvu, "nom='"+nameMedi+"'");
        	
        	return result;
        }
            
//******************************************************************************************************************       
        public boolean updateMedicament(String oldNameMedic, String newNameMadic, String pvu, String nb, String familyName, String seuilAppro) throws Exception{
        	boolean result = false;
        	String updates = "nom='"+newNameMadic+"' AND pvu='"+pvu+"' AND nb="+nb+" AND nom_famille='"+familyName+"' AND seuil_appro="+seuilAppro;
        	result = updateWithCondition("medicament_t", updates, "nom='"+oldNameMedic+"'");
        	return result;
        }
        
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////     ACHAT   ////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
//******************************************************************************************************************       
        public boolean insertAchat(String idAchat, Date dat, String idFrs) throws Exception{
        	boolean ok = false;
        	ok = insert("INSERT INTO achat_t VALUES ('"+idAchat+"','"+dat+"','"+idFrs+"')");      		
        	return ok;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAllAchats() throws Exception{
        	ResultSet result = null;
        	result = selectWithoutCondition("*", "achat_t");      		
        	return result;
        }
    
//******************************************************************************************************************       
        public ResultSet queryAchat(String idAcha) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "achat_t", "id='"+idAcha+"'");
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAchatsFrs(String idFrs) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "achat_t", "id_fournisseur='"+idFrs+"'");
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAchatsDate(Date dat) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "achat_t", "dat='"+dat+"'");
        	return result;
        }
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////    ACHAT MADICAMENT   ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        
//******************************************************************************************************************       
        public boolean insertAchatMedicament(String nomMedi, String idAchat, int nb , Date datePerim, float pau) throws Exception{
        	boolean ok = false;
        	ok = insert("INSERT INTO achat_medicament_t VALUES ('"+nomMedi+"','"+idAchat+"',"+nb+",'"+datePerim+"','"+pau+"')");      		
        	return ok;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAllAchatMedicaments() throws Exception{
        	ResultSet result = null;
        	result = selectWithoutCondition("*", "achat_medicament_t");      		
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAchatMedicament(String nomMedi, String idAchat) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "achat_medicament_t", "nom_medi='"+nomMedi+"' AND id_achat='"+idAchat+"'");
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAchatMedicamentsByAchat(String idAchat) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "achat_medicament_t", "id_achat='"+idAchat+"'");
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAchatMedicamentsByMedi(String nomMedi) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "achat_medicament_t", "nom_medi='"+nomMedi+"'");
        	return result;
        }
        
//******************************************************************************************************************       
        public boolean updateAchatMedicament(String oldNomMedi, String oldIdAchat, int nb, Date datePerim, String pau) throws Exception{
        	boolean result = false;
        	result = updateWithCondition("achat_medicament_t", "nb="+nb+" AND date_perim='"+datePerim+"' AND pau="+pau, "nom_medi='"+oldNomMedi+"' AND id_achat='"+oldIdAchat+"'");     	
        	return result;
        }
              
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////   EMPLOYE  ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//******************************************************************************************************************       
        public boolean insertEmployer(String idEmp, String pwd, String prenom, String nom, String tel, String email) throws Exception{
        	boolean ok = false;
        	ok = insert("INSERT INTO employe_t VALUES ('"+idEmp+"','"+pwd+"','"+prenom+"','"+nom+"','"+tel+"','"+email+"')");      		
        	return ok;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAllEmployes() throws Exception{
        	ResultSet result = null;
        	result = selectWithoutCondition("*", "employe_t");      		
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryEmploye(String idEmp) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "employe_t", "id='"+idEmp+"'");
        	return result;
        }
	
 
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////    FOURNISSEUR   ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
//******************************************************************************************************************       
        public boolean insertFrs(String idFrs, String prenom, String nom, String tel, String email) throws Exception{
        	boolean ok = false;
        	ok = insert("INSERT INTO fournisseur_t VALUES ('"+idFrs+"','"+prenom+"','"+nom+"','"+tel+"','"+email+"')");      		
        	return ok;
        }
        
//******************************************************************************************************************       
        public ResultSet queryAllFrs() throws Exception{
        	ResultSet result = null;
        	result = selectWithoutCondition("*", "fournisseur_t");      		
        	return result;
        }
        
//******************************************************************************************************************       
        public ResultSet queryFrs(String idFrs) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("*", "fournisseur_t", "id='"+idFrs+"'");
        	return result;
        }
        
        
        
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////  FAMILLE   ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//******************************************************************************************************************       
		public boolean insertFamille(String nomFamille, String description) throws Exception{
			boolean ok = false;
			ok = insert("INSERT INTO famille_t VALUES ('"+nomFamille+"','"+description+"')");      		
			return ok;
		}

//******************************************************************************************************************       
		public ResultSet queryAllFamilles() throws Exception{
			ResultSet result = null;
			result = selectWithoutCondition("*", "famille_t");      		
			return result;
		}

//******************************************************************************************************************       
		public ResultSet queryFamille(String nomFamille) throws Exception{
			ResultSet result = null;
			result = selectWithCondition("*", "famille_t", "nom='"+nomFamille+"'");
			return result;
		}


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////   GERANT   ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//******************************************************************************************************************       
		public boolean insertGerant(String idGerant, String prenom, String nom, String tel, String email, String mdp) throws Exception{
        	boolean ok = false;
        	ok = insert("INSERT INTO fournisseur_t VALUES ('"+idGerant+"','"+prenom+"','"+nom+"','"+tel+"','"+email+"','"+mdp+"')");      		
        	return ok;
        }

//******************************************************************************************************************       
		public ResultSet queryAllGerants() throws Exception{
			ResultSet result = null;
			result = selectWithoutCondition("*", "gerant_t");      		
			return result;
		}

//******************************************************************************************************************       
		public ResultSet queryGerant(String idGerant) throws Exception{
			ResultSet result = null;
			result = selectWithCondition("*", "gerant_t", "id='"+idGerant+"'");
			return result;
		}

		

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////   PHARMACIE   ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
            
//******************************************************************************************************************       
        public ResultSet queryPharmaGerant(String idGerant) throws Exception{
        	ResultSet result = null;
        	result = selectWithCondition("nom", "pharmacie_t", "id_gerant='"+idGerant+"'");
        	return result;
        }
        
        public ResultSet queryAllPharmacies() throws Exception{
			ResultSet result = null;
			result = selectWithoutCondition("nom", "pharmacie_t");      		
			return result;
	}

                
                
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////  AUTRES   ///////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public String generId(String tableName) throws Exception{
			String identif="";
			ResultSet result = null;
			result = selectWithoutCondition("*", tableName);
			ArrayList<String> existId = new ArrayList<String>();
			while(result.next()){
				existId.add(result.getString("id"));
			}
			
			boolean ok=false;
			while(!ok){
				Calendar cal = Calendar.getInstance();
		        cal.add(Calendar.DATE, 0);
		        
		        int an = cal.get(Calendar.YEAR);
		        int mois = cal.get(Calendar.MONTH);
		        int jour = cal.get(Calendar.DAY_OF_MONTH);
		        int hh = cal.get(Calendar.HOUR);
		        int min = cal.get(Calendar.MINUTE);
		        int sec = cal.get(Calendar.SECOND);
		        
		        identif =  an+""+mois+""+jour+""+hh+""+min+""+sec;
		        ok = !(existId.contains(identif));		  		        
			}
			return identif;
		}
                
                
                public Date getMyDate(){
			Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DATE, 0);
	        
			int an = cal.get(Calendar.YEAR);
	        int mois = cal.get(Calendar.MONTH);
	        int jour = cal.get(Calendar.DAY_OF_MONTH);
	        @SuppressWarnings("deprecation")
			Date dat = new Date(an, mois, jour);
	        return dat;
			
		}

    
}
