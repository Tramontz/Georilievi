package DAO.clienti;

import hibernate.data.Clienti;
import java.util.List;


public interface ClientiDAO {
    
    public void save(Clienti c);
     
    public List<Clienti> list();
}
