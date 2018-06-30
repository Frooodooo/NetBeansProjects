/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import data.Card;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Frooodooo
 */
public class CardImage extends JLabel {

    public CardImage(Card card, boolean isBlind) {
        String fileName;

        if (isBlind) {
            fileName = "00";

        } else {
            fileName = card.getName();
        }
        fileName += ".png";

        ImageIcon icon = new ImageIcon(getClass().getResource("/cards/" + fileName));

        this.setIcon(icon);

    }
}
