package edu.matc.persistence;

import edu.matc.entity.Card;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
    public void getAllCards() throws Exception {
        List<Card> cards = dao.getAllCards();

        assertTrue(cards.size() > 0);
    }

    @Test
    public void getCard() throws Exception {
        Card card = dao.getCard(1);

        assertNotNull("Null. No card by that id in table", card);
    }

}
