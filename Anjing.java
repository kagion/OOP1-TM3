/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kagion
 */
public class Anjing extends Hewan {
    boolean statusSuntikRabies=true;
    
    
    @Override
    public boolean Status(boolean statuSuntikRabies){
    System.out.println("Status Suntik Rabies = "+statusSuntikRabies);
    return statusSuntikRabies;
    }
}
