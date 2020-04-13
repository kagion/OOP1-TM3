/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kagion
 */
public class Ikan extends Hewan{
    boolean statusGantiAir;
    @Override
    public boolean Status(boolean statusGantiAir){
        System.out.println("Status Ganti Air = "+statusGantiAir);
        return statusGantiAir;
    }
}
