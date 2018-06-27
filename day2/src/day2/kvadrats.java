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
public class kvadrats implements Geometriskafig{
    
    public int malasgarums;
    public String krasa;

    @Override
    public double laukums() {
        return this.malasgarums * this.malasgarums;
    }

    @Override
    public String krasa() {
        return this.krasa;
    }

    @Override
    public double perimetrs() {
        return this.malasgarums *4;
    }
    
    
    
}
