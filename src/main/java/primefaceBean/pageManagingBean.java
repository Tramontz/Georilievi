package primefaceBean;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@RequestScoped
public class pageManagingBean implements Serializable{


     private String page;

     @PostConstruct
     public void init() {
         page = "defaultpage"; //  Default include.
     }

     public void setPage(String page){
     this.page=page;
     System.out.println(this.page);
     }
     
     public String getPage(){
     return page;
     }
}
