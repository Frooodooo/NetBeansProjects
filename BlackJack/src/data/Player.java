/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Frooodooo
 */
public class Player {

    private ArrayList<Card> cards;

    //1. konstruktors kas izveido tuksu sarakstu
    public Player() {
        cards = new ArrayList();
    } //2. metode kas iedod kartis speletajam

    public void giveCard(Card card) {
        cards.add(card);
    } //3. metode kas nosaka vai speletajam vajag vel karti

    public boolean needOterCard() {
        return countPoints() < 21;
    }
//4. metode kas saskaita punktus speletajam 

    public int countPoints() {
        int totalPoints = 0;
        int aceCount = 0;
        // 4.1 jasaskaita max iespejamie speletaja punkti
        for (Card card : cards) {
            int value = card.getValue();
            totalPoints += value;
            if (value == 11) {
                aceCount++;
            }
            while (aceCount > 0 && totalPoints > 21) {
                totalPoints -= 10;
                aceCount--;
               
            }
             
        }
return totalPoints;
        //4.2 ja punktu skaits parsniedz 21 un ir kads duzis, tad punktu skaitu
        //samazina par 10 un atgriezas uz ounkta 4.2
       
    }
    public ArrayList<Card> getCards()
    {
    return this.cards;
    }
}
