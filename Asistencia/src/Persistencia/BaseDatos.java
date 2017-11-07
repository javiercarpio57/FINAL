package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author javie
 */
public class BaseDatos {
    
    EntityManagerFactory emf;  
    EntityManager em; 
    
    public BaseDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("AsistenciaPU");
        em = emf.createEntityManager();
    }
    
    public void cerrarBD(){
        em.close();
        emf.close();
    }
    
    public void agregarEstudiante(){
        em.getTransaction().begin();
        //em.persist(t);
        em.getTransaction().commit();
    }
    
    
}
