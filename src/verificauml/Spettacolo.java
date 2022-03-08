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
public class Spettacolo extends Biglietto {

    private double prezzo;
    private String compagnia;

    public Spettacolo(double prezzo, String compagnia, String tipologia, String genere, String titolo, int data) {
        super(tipologia, genere, titolo, data);
        this.prezzo = prezzo;
        this.compagnia = compagnia;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getCompagnia() {
        return compagnia;
    }

    public void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }

    @Override
    public double calcoloGuadagno(){
        return super.calcoloGuadagno()*prezzo;
    }
    
}
