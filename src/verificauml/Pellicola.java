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
public class Pellicola extends Biglietto{
    private double costoFisso, costoRiproduzione, durata;

    public Pellicola(String tipologia, String genere, String titolo, int data, double costoFisso, double durata) {
        super(tipologia, genere, titolo, data);
        this.costoFisso = costoFisso;
        this.durata = durata;
        costoRiproduzione = costoFisso/this.durata;
        
    }


    public double getCostoRiproduzione() {
        return costoRiproduzione;
    }

    @Override
    public double calcoloGuadagno(){
        return super.calcoloGuadagno()*costoFisso;
    }
}
