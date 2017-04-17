/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpharmacie;

import java.util.Date;

/**
 *
 * @author MT98
 */
public class Approvisionnement {

    private int idAppro;
    private Date dat;

    public Approvisionnement() {
        idAppro = 0;
        dat = null;
    }

    public Approvisionnement(int id, Date Vdat) {
        idAppro = id;
        dat = Vdat;
    }

    public int getIdAppro() {
        return idAppro;
    }

    public Date getDat() {
        return dat;
    }

    public void setIdAppro(int id) {
        idAppro = id;
    }

    public void setDat(Date Vdat) {
        dat = Vdat;
    }
}
