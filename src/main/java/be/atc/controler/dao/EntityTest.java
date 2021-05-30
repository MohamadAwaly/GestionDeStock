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
        List<String> list = new ArrayList<>();
        try {
            EntityManager em = getEntityManager( PERSISTENCE_UNIT_NAME );
            Query query = em.createQuery(
                    "select p from UsersEnt p " );

            list = query.getResultList();

        } catch ( Exception e ) {
            System.out.println( "Erreur dans l'entityTest" );
        }
        return list;

    }

    private EntityManager getEntityManager( String PERSISTANCE ) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( PERSISTANCE );
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        return entityManager;
    }
}
