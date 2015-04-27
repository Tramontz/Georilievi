package DAO.punti;

import java.util.List; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import hibernate.data.Punti;

public class PuntiDAOImpl implements PuntiDAO{    

 
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public void save(Punti p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Punti> list() {
        Session session = this.sessionFactory.openSession();
        List<Punti> puntiList = session.createQuery("from Punti").list();
        session.close();
        return puntiList;
    } 
}