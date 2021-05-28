package be.atc.controler.connexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connexion {
    public static EntityManager getEntityManager (String PERSISTANCE){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( PERSISTANCE );
        EntityManager em = entityManagerFactory.createEntityManager();
        return em;
    }
}
