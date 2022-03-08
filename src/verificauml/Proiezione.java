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
public class Proiezione {
    private Biglietto[] biglietti;
    private Biglietto base;
    private Giorno giorno;
    private int counter = 0;

    public double calcoloGuadagno(int data) {
        double guadagno = 0;
        for (int i = 0; i < counter; i++) {
            if (data == biglietti[i].getData())
                guadagno += biglietti[i].calcoloGuadagno();
        }
        return guadagno;
    }

    public Proiezione(Biglietto base) {
        biglietti = new Biglietto[1000];
        this.base = base;
        giorno = Calendario.g[base.getData()];
        Calendario.g[base.getData()].aggiungiProiezione(this);
    }

    public Biglietto getBase() {
        return base;
    }

    public void aggiungiBiglietto(Biglietto b) {
        biglietti[counter] = b;
        counter++;
    }
}
