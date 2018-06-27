/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Frooodooo
 */
public class Vertejums {

    Macibu_Prieksmets Prieksmets;
    Skolens Skolens;
    int Atzime;

    public Macibu_Prieksmets getPrieksmets() {
        return Prieksmets;
    }

    public void setPrieksmets(Macibu_Prieksmets Prieksmets) {
        this.Prieksmets = Prieksmets;
    }

    public Skolens getSkolens() {
        return Skolens;
    }

    public void setSkolens(Skolens Skolens) {
        this.Skolens = Skolens;
    }

    public int getAtzime() {
        return Atzime;
    }

    public void setAtzime(int Atzime) {
        this.Atzime = Atzime;
    }

    public String Informacija() {
        return "Skolens = " + Skolens.Vards + " " + Skolens.UZvards + ", ieguva " + Prieksmets.Nosaukums + " pie " + Prieksmets.Pasniedzejs.Vards + " " + Atzime + " balles";
    }

}
