package day5;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Frooodooo
 */
public class uzdevumi {

    private static Scanner ievade = new Scanner(System.in);

    public static void Piemeri() {
        System.out.print("Ievadi valsti: ");
        String valsts = ievade.next().toLowerCase();

        switch (valsts) {
            case "latvija":
                System.out.println("Riga");
                break;
            case "lietuva":
                System.out.println("Vilna");
                break;
            default:
                System.out.println("Nezinama valsts!");
                break;
        }

    }

    public static void Piemeri1() {
        System.out.print("Ievadi skaitli 1: ");
        int sk1 = ievade.nextInt();

        System.out.print("Ievadi simbolu: ");
        char sim1 = ievade.next().charAt(0);

        System.out.print("Ievadi skaitli 1: ");
        int sk2 = ievade.nextInt();

        System.out.print("Ievadi simbolu: ");
        char sim2 = ievade.next().charAt(0);

        System.out.print("Ievadi skaitli 1: ");
        int sk3 = ievade.nextInt();

        double rezultats;
        if (sim1 == '*' || sim1 == '/') {
            rezultats = aprekins(sk1, sk2, sim1);
            rezultats = aprekins(rezultats, sk3, sim2);
        } else {
            rezultats = aprekins(sk2, sk3, sim2);
            rezultats = aprekins(sk1, rezultats, sim1);
        }
        System.out.println(rezultats);
    }

    private static double aprekins(double sk1, double sk2, char sim1) {

        switch (sim1) {
            case '*':
                return sk1 * sk2;

            case '/':
                return sk1 / sk2;

            case '+':
                return sk1 + sk2;

            case '-':
                return sk1 - sk2;

            default:
                return 0;
        }

    }

    public static void MasiviSarakti() {
        int[] skaitluMasivs = new int[2];
        skaitluMasivs[0] = 3;
        skaitluMasivs[1] = 4;
        skaitluMasivs[2] = 3;

        int[] skaitlusMasivs2 = {3, 4, 5};
        int masivaIeraksti = skaitlusMasivs2.length;
        int tresais = skaitlusMasivs2[2];
        boolean ircetri = false;
        for (int skaitlis : skaitlusMasivs2) {

            System.out.println(skaitlis);

            if (skaitlis == 4) {
                System.out.println("Skaitli 4 ir masiva");
                ircetri = true;
            }
            
        }
        if (ircetri)
        {
        System.out.println("Skaitli 4 ir navmasiva");
        }
        ArrayList<String> tekstaSaraksts = new ArrayList<String>();
        {
            tekstaSaraksts.add("teksts1");
            tekstaSaraksts.add("teksts2");
            tekstaSaraksts.add("teksts3");
            int saraksti = tekstaSaraksts.size();
            String tresv = tekstaSaraksts.get(3);
            for (String vards : tekstaSaraksts) {
                System.out.println(vards);
            }
        }
    }
}
