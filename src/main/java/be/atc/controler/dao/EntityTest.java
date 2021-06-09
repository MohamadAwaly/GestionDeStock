package be.atc.controler.dao;

import be.atc.controler.connexion.Factory;

import javax.persistence.*;

import org.apache.log4j.Level;

import java.util.ArrayList;
import java.util.List;

public class EntityTest {
    private static final String                  JPQL_SELECT_USER = "SELECT u FROM UsersEnt u";
    final static         org.apache.log4j.Logger logger                = org.apache.log4j.Logger
            .getLogger( EntityTest.class );

    // Injection du manager, qui s'occupe de la connexion avec la BDD
    //@PersistenceContext( unitName = "UsersEnt" )
    public List<String> listDesPersonnes() {
        System.out.println("Début de la méthode");
        List<String> list = new ArrayList<>();
        System.out.println("Apres la déclaration");
        try {
            System.out.println("Début du try");

            EntityManager em = EMF.getEM( );
            System.out.println("em:" + em);
            System.out.println("Déclaration du query");
            Query query = em.createQuery(
                    "select p from UsersEnt p ", UsersEnt.class );
            System.out.println("apres le query");
            System.out.println("Avant la liste");

            list = query.getResultList();
            System.out.println("apres la liste");

        } catch ( Exception e ) {
            System.out.println( "Erreur dans l'entityTest: "  + e);
        }
        return list;

    }

    public void test(){
        Factory factory = Factory.getInstance();
        logger.log( Level.INFO, "factoryyyyyyyyyyyyyyyyyyyyyyyyy" );
        logger.log( Level.INFO, factory );
    }

    private EntityManager getEntityManager( String PERSISTANCE ) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( PERSISTANCE );
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        logger.log(Level.INFO, "Connexion OK");
        return entityManager;
    }
}
