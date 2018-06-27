/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Frooodooo
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kvadrats Kvadrats = new kvadrats();
        aplis Aplis = new aplis();

        Kvadrats.krasa = "Melns";
        Kvadrats.malasgarums = 12;

        Aplis.krasa = "Sarkans";
        Aplis.radius = 5;

        double laukums = Kvadrats.laukums();
        double perimetrs = Kvadrats.perimetrs();
        String krasa = Kvadrats.krasa();

        System.out.println("Kvadrata laukums = " + Kvadrats.laukums());
        System.out.println("Kvadrata perimetrs = " + Kvadrats.perimetrs());
        System.out.println("Kvadrata krasa = " + Kvadrats.krasa());

        System.out.println("Aplia laukums = " + Aplis.laukums());
        System.out.println("Aplia perimetrs = " + Aplis.perimetrs());
        System.out.println("Aplia krasa = " + Aplis.krasa());

        Kravas k = new Kravas();
        k.Marka = "S";
        k.Razotajs = "Audi";
        k.gads = 1994;
        k.kravasIetilpiba = 3454.23;

        Pasazieru p = new Pasazieru();
        p.Marka = "M";
        p.Razotajs = "Mers";
        p.gads = 1998;
        p.pasazieri = 60;

        KravasAuto(k);
        PasazieruAuto(p);
    }

    static void Izvade(Geometriskafig figura) {
        System.out.println("Kvadrata laukums = " + figura.laukums());
        System.out.println("Kvadrata perimetrs = " + figura.perimetrs());
        System.out.println("Kvadrata krasa = " + figura.krasa());
    }

    static void KravasAuto(Kravas k) {
        System.out.println(k.toString());
    }

    static void PasazieruAuto(Pasazieru p) {
        System.out.println(p.toString());
    }
}
