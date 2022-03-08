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
public class Biglietto {

    private String tipologia, genere, titolo;
    private int data;

    public double calcoloGuadagno() {
        switch (tipologia) {
            case "bambino":
            case "anziano":
                return 0.8;
            case "adulto":
                return 1;
        }
        return 1;
    }

    public Biglietto(String tipologia, String genere, String titolo, int data) {
        this.tipologia = tipologia;
        this.genere = genere;
        this.titolo = titolo;
        this.data = data;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
