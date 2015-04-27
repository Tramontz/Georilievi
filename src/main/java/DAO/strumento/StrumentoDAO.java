/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.strumento;

import hibernate.data.Strumento;
import java.util.List;

/**
 *
 * @author COSTANZO
 */
public interface StrumentoDAO {
 
     public void save(Strumento s);
     
    public List<Strumento> list();
}
