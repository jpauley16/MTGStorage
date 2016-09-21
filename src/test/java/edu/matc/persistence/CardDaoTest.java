package edu.matc.persistence;

import edu.matc.entity.Card;
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
    public void getAllCardss() throws Exception {
        List<Card> cards = dao.getAllCards();

        assertTrue(cards.size() > 0);
    }

}
