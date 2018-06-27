/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1;

/**
 *
 * @author Frooodooo
 */
public class daudzsturi implements GeometriskaFiguras
 {

    public int mala;
    public int mala1;
    public int mala2;

    public daudzsturi(int mala) {
        this.mala = mala;
    }

    @Override
    public double perimetrs() {
        return this.mala * 4;
    }

    @Override
    public int mala() {
        return this.mala;
    }

    @Override
    public double laukums() {
        return this.mala * this.mala();
    }

    @Override
    public int mala1() {
        return this.mala1;
    }

    @Override
    public int mala2() {
        return this.mala2;
    }

}
