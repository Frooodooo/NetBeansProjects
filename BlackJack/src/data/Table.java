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
public class Table {

    private Player player;
    private Dealer dealer;
    private Deck deck;

    public Table() {

    }

    public void startNewGame() {
        //1. izveido dalibnieka objektus
        player = new Player();
        dealer = new Dealer();
        //2. iveido karsu kavu
        deck = new Deck();
        //2. sajauc kartis
        deck.shuffle();
        //3.katram dlibniekam iedod kartis 2

        player.giveCard(deck.takeCard());
        player.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());

    }

    public void dealerTurn() {
        while (dealer.needOtherCard()) {
            dealer.giveCard(deck.takeCard());
        }
    }

    public void givePlaverCard() {
        //1. panem karti no karsu kavas
        player.giveCard(deck.takeCard());
        //2.iedod karti speletajam

    }

    public int getPlayerPoints() {
        //1. atgriez speletaja punktus
        return player.countPoints();
    }

    public int getDealerPoints() {
        //1. atgriez dilera punktus
        return dealer.countPoints();
    }

    public String getResult() {
        //1.nolasa speletaja punktus
        int speletajaPunkti = getPlayerPoints();
        //2.nolasa dilera punktus
        int dealerPunkti = getDealerPoints();
        //3.atgriez pazinojumu kurs uzvareja spele
        if (speletajaPunkti < 21) {
            return "Tu uzvareji!";
        } else if (dealerPunkti < 21) {
            return "Tu zaudeji!";
        } else if (dealerPunkti < speletajaPunkti) {
            return "Tu uzvareji!";
        } else if (dealerPunkti > speletajaPunkti) {
            return "Tu zaudeji!";
        } else if (dealerPunkti == speletajaPunkti) {
            return "Tu uzvareji!";
        } else {
            return "Tu zaudeji!";
        }

    }

    public ArrayList<Card> getPlayerCards() {
        //1. atgreiz speletaja karti
        return player.getCards();
    }

    public ArrayList<Card> getDealerCards() {
        //1. atgriez dileta karti
        return dealer.getCards();
    }
}
