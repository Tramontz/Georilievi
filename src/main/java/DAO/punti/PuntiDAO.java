package DAO.punti;

import java.util.List;
import hibernate.data.Punti;


public interface PuntiDAO {
    
    public void save(Punti p);
     
    public List<Punti> list();
}
