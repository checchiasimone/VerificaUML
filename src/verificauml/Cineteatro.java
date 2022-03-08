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
public class Cineteatro {
    private static Biglietto [] b = new Biglietto[100];
    private static Proiezione [] p = new Proiezione[2];
    private static Calendario c = new Calendario();
    public static void calendarizzazione(){
        for(int i=0; i<365; i++){
            c.g[i].aggiungiProiezione(p[(int)(Math.random()*2)]);
        }
    }
    public static double calcoloGuadagno(){
        return c.calcoloGuadagno();
    }
    public static void main(String[] args) {
        p[0] = new Proiezione(new Pellicola("boh", "boh", "boh", 0, Math.random()*20, 90));
        p[1] = new Proiezione(new Spettacolo(Math.random()*40, "boh", "boh", "comico", "ciao", 0));
        for(int i=0; i<b.length; i++){
            if((int)(Math.random()*2)==1){
                b[i] = new Pellicola("boh", "boh", "boh", (int)(Math.random()*365)+1, Math.random()*20, 90);
                p[0].aggiungiBiglietto(b[i]);
            }else{
                b[i] = new Spettacolo(Math.random()*40, "boh", "boh", "comico", "ciao", (int)(Math.random()*365)+1);
                p[1].aggiungiBiglietto(b[i]);
            }
        }
        calendarizzazione();
        System.out.println(calcoloGuadagno());
    }
    public static Calendario getC() {
        return c;
    }
    public static Proiezione[] getP() {
        return p;
    }

    

    
}
