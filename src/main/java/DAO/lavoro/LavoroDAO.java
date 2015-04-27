package DAO.lavoro;

import java.util.List;
import hibernate.data.Lavoro;

public interface LavoroDAO {     
 
    public void save(Lavoro l);
     
    public List<Lavoro> list();
}
