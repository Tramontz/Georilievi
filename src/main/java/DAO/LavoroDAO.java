package DAO;

import java.util.List;
import data.Lavoro;

public interface LavoroDAO {     
 
    public void save(Lavoro l);
     
    public List<Lavoro> list();
}
