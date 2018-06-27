/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdbanka;

import java.util.Scanner;

/**
 *
 * @author Frooodooo
 */
public class PDBanka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
        System.out.print("Vards = ");
        String vards = ievade.next();
        System.out.print("Uzvards = ");
        String uzvards = ievade.next();
        System.out.print("Dzimums = ");
        char dzimums = ievade.next().charAt(0);
        Banka kl = new Banka(vards, uzvards, dzimums);
        
        
        while (true) {
             kl.amount =  0;
            System.out.println("Darbiba: ");
            String dr = ievade.next();
           
            if ("customer".equals(dr)) {
                
                System.out.print(kl.getCustomer());
            }
            if ("customername".equals(dr)) {
                System.out.print(kl.getCustomerName());
                
            }
            if ("balance".equals(dr)) {
                System.out.print(kl.getBalance());
                
            }
            if ("deposit".equals(dr)) {
                System.out.print("summa: ");
                kl.amount = ievade.nextInt();
                if (kl.amount > 0 || kl.amount >= 10000) {
                    kl.deposit();
                    System.out.print(kl.getBalance());
                } else if (kl.amount <= 0) {
                    System.out.println("nepietiek lidzeklu!");
                    return;
                }
            }
            if ("withdraw".equals(dr)) {
                System.out.print("summa: ");
                kl.amount = ievade.nextInt();
                if (kl.amount > 0 || kl.amount >= 500) {
                    kl.withdraw();
                    System.out.print(kl.getBalance());
                            
                } else if (kl.amount <= 0) {
                    System.out.println("nepietiek lidzeklu!");
                    return;
                }
            }
        }
    }

}
