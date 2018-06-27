/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2ievade;

import java.util.Scanner;

/**
 *
 * @author Frooodooo
 */
public class Day2Ievade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //gradi();
        attalums();
//        Scanner ievade = new Scanner(System.in);
//
//        System.out.print("Vards = ");
//        String Vards = ievade.next();
//        System.out.print("Uzvards = ");
//        String Uzvards = ievade.next();
//
//        System.out.printf("Sveiks %s %s !", Vards, Uzvards);

    }

    static void gradi() {
        Scanner ievade = new Scanner(System.in);
        System.out.print("Gradi = ");
        double Gradi = ievade.nextDouble();
        System.out.print("Mervieniba = ");
        char mervieniba = ievade.next().charAt(0);

        mervieniba = Character.toUpperCase(mervieniba);
        if (mervieniba == 'F') {
            System.out.print((Gradi - 32) / 1.8 + "C");
        } else if (mervieniba == 'C') {
            System.out.print(Gradi * 1.8 + 32);
        } else {
            System.out.print("Nezinama mervieniba!");
        }

    }

    static void attalums() {
        Scanner ievade = new Scanner(System.in);
        int attalums;
        int laiks;
        int pateretadeg;

        System.out.print("Attalums = ");
        attalums = ievade.nextInt();
        System.out.print("laiks = ");
        laiks = ievade.nextInt();
        System.out.print("patereta degviela = ");
        pateretadeg = ievade.nextInt();
        double stunda = (double)laiks / 60;
        int sekunde = laiks * 60;

        double atrkmh = (double)attalums / stunda;
        double atrkmm = (double)attalums / laiks;

        double degpat = (double)attalums / pateretadeg;
        double degpa = degpat / (double)laiks;
        System.out.println("Laiks stundas = " + stunda);
        System.out.println("Laiks sekundes = " + sekunde);
        System.out.println("atrums km/h = " + atrkmh);
        System.out.println("atrums km/min = " + atrkmm);
        System.out.println("Videja patereta degviela km/l = " + degpat);
        System.out.println("Videja patereta degviela uz 100km = " + degpa);
    }
}
