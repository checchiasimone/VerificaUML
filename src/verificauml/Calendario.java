/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificauml;

/**
 *
 * @author checchia.simone
 */
public class Calendario {
    public static Giorno g [] = new Giorno[365];
    public Calendario(){
        for(int i=0; i<g.length; i++){
            g[i] = new Giorno(i);
        }
    }
    public double calcoloGuadagno(){
        double guadagno = 0;
        for (int i=0; i<g.length; i++) {
            // System.out.println(g[i].calcoloGuadagno());
            guadagno+=g[i].calcoloGuadagno();
        }
        return guadagno;
    }
    
}
