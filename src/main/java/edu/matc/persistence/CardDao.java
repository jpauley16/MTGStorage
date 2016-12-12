package edu.matc.persistence;

import edu.matc.entity.Card;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by netherskub on 9/21/16.
 */
public class CardDao {

    private final Logger log = Logger.getLogger(this.getClass());


    public Set<Card> getAllCardsByUsername(String username) {

        List<Card> cards = new ArrayList<Card>();
        Session session = SessionFactoryProvider.getSessionFactory().getCurrentSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            cards = (List<Card>) session.createCriteria(Card.class)
                    .add(Restrictions.eq("username", username))
                    .list();
            log.info("getting all cards by username");
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            log.error(e);
        } finally {
            log.info("all cards received");
        }

        return new HashSet<Card>(cards);
    }

    public Set<Card> getCardByUsernameAndName(String username, String name) {
        List<Card> cards = new ArrayList<Card>();
        Session session = SessionFactoryProvider.getSessionFactory().getCurrentSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            cards = (List<Card>) session.createCriteria(Card.class)
                    .add(Restrictions.eq("username", username))
                    .add(Restrictions.eq("name", name))
                    .list();
            log.info("getting card by username and name");
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            log.info("card received");
        }

        return new HashSet<Card>(cards);
    }

    public Card addCard(Card card) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(card);
            log.info("adding card to database");
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            log.info(e);
        } finally {
            log.info("Card added");
            session.close();
        }

        return card;
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
            log.info("Card deleted");
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
            updatedCard.setSubType(card.getSubType());
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
            log.info("Updated Card!");
        }
    }


}
