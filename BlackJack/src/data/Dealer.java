/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Frooodooo
 */
public class Dealer extends Player {

    public Dealer() {

    }
    public boolean needOtherCard() {
        return this.countPoints() < 17;
    }
    
}
