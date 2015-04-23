package main;

import java.util.List;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import DAO.LavoroDAO;
import data.Lavoro;
 
public class SpringHibernateMain {
 
    public static void main(String[] args) {
 System.out.println("bene 1");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
         System.out.println("bene 2");
        LavoroDAO lavoroDAO = context.getBean(LavoroDAO.class);
         System.out.println("bene 3");
        Lavoro lavoro = new Lavoro();
        
         System.out.println("bene 4");
        List<Lavoro> list = lavoroDAO.list();
         System.out.println("bene 5");
        for(Lavoro l : list){
            System.out.println("bene 7");
            System.out.println("Lavoro List::"+l);
            System.out.println("bene 6");
        }
        //close resources
        context.close();    
    }
    
}