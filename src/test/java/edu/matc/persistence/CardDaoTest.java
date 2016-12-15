package edu.matc.persistence;

import edu.matc.entity.Card;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by netherskub on 9/21/16.
 */


public class CardDaoTest {

    CardDao dao;

    @Before
    public void setup() {

        dao = new CardDao();
    }

    @Test
    public void getCardByUsernameAndName() throws Exception {
        String username = "admin";
        String cardName = "Sol Ring";
        Set<Card> cards = dao.getCardByUsernameAndName(username, cardName);

        assertTrue(cards.size() > 0);
    }

    @Test
    public void getAllCardsByUsername() throws Exception {
        Set<Card> cards = dao.getAllCardsByUsername("admin");

        assertTrue(cards.size() > 0);
    }

    @Test
    public void deleteCard() throws Exception {
        Set<Card> cards = dao.getCardByUsernameAndName("admin", "Test");
        int cardKey;
            for(Card cardClass : cards) {
                cardKey = cardClass.getCardKey();
                dao.deleteCard(cardKey);
                assertNotNull("Null. No card by that card key", cardKey);
            }
    }


    @Test
    public void addCard() throws Exception {
        int cardKey = 0;
        Card card = new Card();
        card.setName("Test");
        card.setManaCost("4C3G");
        card.setSuperType("Basic");
        card.setSubType("Insect");
        card.setRarity("Rare");
        card.setPower("2");
        card.setToughness("2");
        card.setColor("Green");
        card.setUsername("admin");
        card.setQty(1);

        cardKey = dao.addCard(card);

        assertTrue(cardKey > 0);
        //dao.deleteCard(cardKey);
    }
/*
    @Test
    public void updateCard() throws Exception {
        Card card = new Card();

        dao.updateCard(card);

        assertTrue("Changed name is " , card.getName().equals(""));
    }
    */
}
