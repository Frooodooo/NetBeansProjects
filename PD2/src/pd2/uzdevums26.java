/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd2;

import java.util.Scanner;

/**
 *
 * @author Frooodooo
 */
public class uzdevums26 {

    public static void uzdevums() {
        Scanner ievade = new Scanner(System.in);

        System.out.print("Cik skaitlus ievadisi = ");
        int sk = ievade.nextInt();
        int[] masivs = new int[sk];
        for (int i = 1; i < sk; i++) {
            System.out.print("Ievadi skaitli = ");
            masivs[i] = ievade.nextInt();
        }
        int max = masivs[0];
        int min = masivs[0];
        for (int Masivs : masivs) {
            if (Masivs < min) {
                min = Masivs;
            }
            if (Masivs > max) {
                max = Masivs;
            }
        }
        System.out.print("min = " + min);
        System.out.print("max = " + max);
    }

    public static void kopigasvertibas() {
        int[] masivs1 = masivaievade();
        int[] masivs2 = masivaievade();

        for (int sk1 : masivs1) {
            for (int sk2 : masivs2) {
                if (sk1 == sk2) {
                    System.out.println(sk1);
                }
            }
        }
    }

    public static int[] masivaievade() {
        Scanner ievade = new Scanner(System.in);
        System.out.print("Ievadi masiva skaitu = ");
        int sk = ievade.nextInt();
        int[] masivs = new int[sk];
        for (int i = 0; i < sk; i++) {
            System.out.print("Ievadi skaitli = ");
            masivs[i] = ievade.nextInt();
        }
        return masivs;
    }

}
