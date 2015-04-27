package DAO.lavoro;

import java.util.List; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import hibernate.data.Lavoro;

public class LavoroDAOImpl implements LavoroDAO{
    

 
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public void save(Lavoro l) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(l);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Lavoro> list() {
        Session session = this.sessionFactory.openSession();
        List<Lavoro> lavoroList = session.createQuery("from Lavoro").list();
        session.close();
        return lavoroList;
    } 
}
