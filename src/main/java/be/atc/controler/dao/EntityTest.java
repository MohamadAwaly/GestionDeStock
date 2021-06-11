package be.atc.controler.dao;

import be.atc.entities.UsersEnt;
import org.apache.log4j.Level;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class EntityTest {
    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger
            .getLogger( EntityTest.class );

    public List<UsersEnt> listDesPersonnes() {
        List<UsersEnt> user = new ArrayList<>();
        try {
            EntityManager em = EMF.getEM();
            user = em
                    .createQuery( "select u from UsersEnt u ")
                    .getResultList();
        } catch ( Exception e ) {
            System.out.println( "Erreur dans l'entityTest: " + e );
        }
        return user;
    }
}
