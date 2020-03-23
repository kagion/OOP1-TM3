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
public class Ikan extends Hewan{
    private boolean statusGantiAir;
    public Ikan() {
        super();
        this.statusGantiAir = true;
    }

    public Ikan(boolean statusGantiAir) {
        this.statusGantiAir = statusGantiAir;
    }

    public void status() {
        System.out.println(statusGantiAir);
    }
}
