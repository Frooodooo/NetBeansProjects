/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1;

import java.util.Scanner;

/**
 *
 * @author Frooodooo
 */
public class PD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
        System.out.print("mala 1 = ");
        int mala = ievade.nextInt();
        System.out.print("mala 2 = ");
        int mala1 = ievade.nextInt();
        System.out.print("mala 3 = ");
        int mala2 = ievade.nextInt();
        System.out.print("Ievadi figuru = ");
        String fig = ievade.next();

        daudzsturi kv1 = new daudzsturi(mala);
        trissturis tr1 = new trissturis(mala, mala1, mala2);
        Pentagon pt1 = new Pentagon(mala);
        Taisnsturis ts1 = new Taisnsturis(mala, mala1);

        double laukums = kv1.laukums();
        double perimetrs = kv1.perimetrs();

        if ("kvadrats".equals(fig)) {
            Izvade(kv1);
        }
        if ("tristuris".equals(fig)) {
            Izvade(tr1);

        }
        if ("pentagons".equals(fig)) {
            Izvade(pt1);

        }
        if ("taisnsturis".equals(fig)) {
            Izvade(ts1);

        }

    }

    static void Izvade(GeometriskaFiguras figura) {
        System.out.println(figura + " laukums = " + figura.laukums());
        System.out.println(figura + " perimetrs = " + figura.perimetrs());
    }

}
