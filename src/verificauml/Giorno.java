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
public class Giorno {
    private Proiezione[] proiezioni;
    private int numGiorno;
    public double calcoloGuadagno(){
        double costo = 0;
        for(int i=0; i<1; i++){
            costo += proiezioni[i].calcoloGuadagno(numGiorno);
        }
        return costo;
    }

    public Giorno(int numGiorno){
        proiezioni = new Proiezione[1];
        this.numGiorno = numGiorno;
    }

    public Giorno(Proiezione[] proiezioni) {
        this.proiezioni = proiezioni;
    }

    public void aggiungiProiezione(Proiezione p){
        proiezioni[0] = p;
    }

    public Proiezione getProiezione(){
        return proiezioni[0];
    }
}
