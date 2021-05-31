package be.atc.controler.dao;

import be.atc.entities.UsersEnt;

import javax.persistence.*;

import be.atc.entities.UsersEnt;
import org.apache.log4j.Level;

import java.util.ArrayList;
import java.util.List;

public class EntityTest {
    private static final String                  JPQL_SELECT_PAR_EMAIL = "SELECT u FROM UsersEnt u WHERE u.mail=:email";
    private static final String                  PARAM_EMAIL           = "email";
    private static final String                  PERSISTENCE_UNIT_NAME = "stockmanagement";
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
            EntityManager em = getEntityManager( PERSISTENCE_UNIT_NAME );
            System.out.println("Déclaration du query");
            Query query = em.createQuery(
                    "select p from UsersEnt p " );
            System.out.println("apres le query");
            System.out.println("Avant la liste");

            list = query.getResultList();
            System.out.println("apres la liste");

        } catch ( Exception e ) {
            System.out.println( "Erreur dans l'entityTest" );
        }
        return list;

    }

    private EntityManager getEntityManager( String PERSISTANCE ) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( PERSISTANCE );
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Connexion ok");
        return entityManager;
    }
}
