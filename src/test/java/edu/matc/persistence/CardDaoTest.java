/**
package edu.matc.persistence;

import edu.matc.entity.Card;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by netherskub on 9/21/16.


public class CardDaoTest {

    CardDao dao;

    @Before
    public void setup() {

        dao = new CardDao();
    }

    @Test
    public void getAllCards() throws Exception {
        List<Card> cards = dao.getAllCards();

        assertTrue(cards.size() > 0);
    }

    @Test
    public void getCard() throws Exception {
        Card card = dao.getCard(1);

        assertNotNull("Null. No card by that id in table", card);
    }

    @Test
    public void deleteCard() throws Exception {
        dao.deleteCard(1);

        assertNotNull("Null. No card by that card key");
    }

    @Test
    public void addCard() throws Exception {
        Card card = new Card();
        card.setName("");
        card.setManaCost("");
        card.setSuperType("");
        card.setSubtype("");
        card.setRarity("");
        card.setDescription("");
        card.setPower("");
        card.setToughness("");
        card.setColor("");
        card.setQty();

        int cardKey = dao.addCard(card);

        assertEquals("Id equals 2 for new user", 4, cardKey);
    }

    @Test
    public void updateCard() throws Exception {
        Card card = new Card();

        dao.updateCard(card);

        assertTrue("Changed name is " , card.getName().equals(""));
    }

}
*/