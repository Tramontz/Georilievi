package main;

import java.util.List;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import DAO.LavoroDAO;
import data.Lavoro;
 
public class SpringHibernateMain {
 
    public static void main(String[] args) {
 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
         
        LavoroDAO lavoroDAO = context.getBean(LavoroDAO.class);
         
        Lavoro lavoro = new Lavoro();
        
         
        List<Lavoro> list = lavoroDAO.list();
         
        for(Lavoro l : list){
            System.out.println("Lavoro List::"+l);
        }
        //close resources
        context.close();    
    }
    
}