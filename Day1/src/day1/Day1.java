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
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    Kvadrats kv1 = new Kvadrats();
//    
//    kv1.setMalasGarums(5.5);
//    kv1.setKrasa("Sarkans");
//    double laukums = kv1.laukums();
//    double perimetrs = kv1.perimetrs();
//    
//    Kvadrats kv2 = new Kvadrats (6, "Melns");
//    laukums = kv2.laukums();
//    perimetrs = kv2.perimetrs();
//    
//    System.out.println("Kvadrata 2 laukums = " + laukums);
//    System.out.println("Kvadrata 2 perimetrs = " + perimetrs);
//    System.out.println("Kvadrata 2 krasa = " + kv1.getKrasa());

        Skolens Sk1 = new Skolens();
        Klase Kl1 = new Klase();
        Telpa Tp1 = new Telpa();
        Vertejums Vr1 = new Vertejums();
        Macibu_Prieksmets Mp1 = new Macibu_Prieksmets();
        Skolotajs S1 = new Skolotajs();

        Sk1.setDzGads(1998);
        Sk1.setEpasts("kattanav@gmail.com");
        Sk1.setVards("Martins");
        Sk1.setUZvards("Paegle");
        Sk1.setKlase(Kl1);

        S1.setVards("Viktors");
        S1.setUzvards("Blaumanis");
        S1.setEpasts("Viktors@gmail.com");

        Kl1.setNosaukums("Matematika");
        Kl1.setTelpa(Tp1);
        Kl1.setSkolenuSkaits(12);

        Tp1.setNummurs(5);
        Tp1.setStavs(2);

        Mp1.setNosaukums("Matematika");
        Mp1.setTelpa(Tp1);
        Mp1.setPasniedzejs(S1);

        Vr1.setAtzime(10);
        Vr1.setPrieksmets(Mp1);
        Vr1.setSkolens(Sk1);

        System.out.println(Vr1.Informacija());

        Auto auto = new Auto();
        Lidmasina lidmasina = new Lidmasina();

        //auto.parvietoties();
        //lidmasina.parvietoties();
        parvietot(auto);
        parvietot(lidmasina);

        Direktors d = new Direktors();
        d.uzvards = "Liepins";
        d.vards = "Viktors";

        System.out.println(d.toString());
        darbinieksVards(d);

    }

    static void darbinieksVards(Darbinieks d) {
        System.out.println(d.toString());
    }

    static void parvietot(TransportLidzeklis tr) {
        tr.parvietoties();
    }
}
