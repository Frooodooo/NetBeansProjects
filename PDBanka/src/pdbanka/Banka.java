/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdbanka;

/**
 *
 * @author Frooodooo
 */
public class Banka implements Klients {

    public String vards;
    public String uzvards;
    public char dzimums;
    public int balance;
    public double amount;
    public Banka(String vards, String uzvards, char dzimums) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.dzimums = dzimums;
    }

    @Override
    public String vards() {
        return this.vards;
    }

    @Override
    public String uzvards() {
        return this.uzvards;
    }

    @Override
    public char dzimums() {
        return this.dzimums;
    }

    public String getCustomer() {
        return "vards: " + this.vards + " uzvards: " + this.uzvards + " dzimums: " + this.dzimums;
    }
    public String getCustomerName() {
        return "vards: " + this.vards;
    }
    public int getBalance()
    {
    return this.balance;
    }
    public double deposit ()
    {
        return this.amount + this.balance;
    }
    public double withdraw ()
    {
        return this.amount - this.balance;
    }
    
}
