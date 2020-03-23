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
public class Aplikasi {
    public static void main(String args[]) {
        Hewan hewan = new Hewan();
        Anjing ajg = new Anjing(false);
        Ikan ikan = new Ikan();


        hewan.status();
        ajg.status();
        ikan.status();
    }

}
