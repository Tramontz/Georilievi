package DAO.strumento;

import hibernate.data.Strumento;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StrumentoDAOImpl implements StrumentoDAO {

 private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public void save(Strumento s) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(s);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Strumento> list() {
        Session session = this.sessionFactory.openSession();
        List<Strumento> strumentoList = session.createQuery("from Strumento").list();
        session.close();
        return strumentoList;
    } 
}
