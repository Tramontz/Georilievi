package DAO.clienti;

import java.util.List; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import hibernate.data.Clienti;

public class ClientiDAOImpl implements ClientiDAO{
    

 
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public void save(Clienti c) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(c);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Clienti> list() {
        Session session = this.sessionFactory.openSession();
        List<Clienti> clientiList = session.createQuery("from Clienti").list();
        session.close();
        return clientiList;
    } 
}