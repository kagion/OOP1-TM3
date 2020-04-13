/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kagion
 */
public class Hewan {
    String id="001";
    String pemilik="doni";
    boolean statuspenitipan;
    
    public String info(String id, String pemilik){
       System.out.println(id + ":" +pemilik);
//        return null;
        return id +":"+ pemilik;
    }
    public boolean Status(boolean statuspenitipan){
//       System.out.println(this.statuspenitipan);
//        return false;
    return statuspenitipan;
    }
}
