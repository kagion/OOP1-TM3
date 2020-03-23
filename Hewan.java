/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TM3_PEWARISAN;

/**
 *
 * @author kagion
 */
public class Hewan {
    String id;
    private String pemilik;
    private boolean statusPenitipan;
    
    public Hewan() {
        id = "20001";
        pemilik = "tidak ada";
        statusPenitipan = true;
    }
    public Hewan(String id, String pemilik) {
        this.id = id;
        this.pemilik = pemilik;
        this.statusPenitipan = statusPenitipan;
    }
    public void info() {
        System.out.println(id + " : " + pemilik);
    }
    public void status() {
        System.out.println(statusPenitipan);
    }
    //setter geter
    public void setId(String id) {
        this.id = id;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    public void setStatusPenitipan(boolean statusPenitipan){
        this.statusPenitipan = statusPenitipan;
    }

    public String getId() { return id; }

    public String getPemilik() { return pemilik; } 
    
    public boolean getStatusPenitipan(){return statusPenitipan;}
}
