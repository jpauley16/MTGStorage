package edu.matc.persistence;

import edu.matc.entity.Card;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by netherskub on 9/21/16.
 */
public class CardDao {

    private final Logger log = Logger.getLogger(this.getClass());


    public List<Card> getAllCards() {
        List<Card> cards = new ArrayList<Card>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        cards = session.createCriteria(Card.class).list();

        return cards;
    }

    public Card getCard(int cardKey) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Card card = (Card) session.get(Card.class, cardKey);

        return card;
    }


}
