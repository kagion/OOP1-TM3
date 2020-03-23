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
public class Anjing extends Hewan{
    private boolean statusSuntikRabies;
    public Anjing() {
        super();
        this.statusSuntikRabies = true;
    }

    public Anjing(boolean statusSuntikRabies) {
        
        this.statusSuntikRabies = statusSuntikRabies;
    }

    public void status() {
        System.out.println(statusSuntikRabies);
    }
}
