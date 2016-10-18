package edu.matc.persistence;

import edu.matc.entity.Card;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

    public int addCard(Card card) {
        int cardKey = 0;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(card);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }

        cardKey = card.getCardKey();

        return cardKey;
    }

    public void deleteCard(int cardKey) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Card card = (Card) session.get(Card.class, cardKey);
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(card);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }

    public void updateCard(Card card) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Card updatedCard = (Card) session.get(Card.class, card.getCardKey());
            updatedCard.setName(card.getName());
            updatedCard.setManaCost(card.getManaCost());
            updatedCard.setSuperType(card.getSuperType());
            updatedCard.setSubtype(card.getSubtype());
            updatedCard.setRarity(card.getRarity());
            updatedCard.setPower(card.getPower());
            updatedCard.setToughness(card.getToughness());
            updatedCard.setColor(card.getColor());
            updatedCard.setQty(card.getQty());

            session.update(updatedCard);

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null ) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }


}
