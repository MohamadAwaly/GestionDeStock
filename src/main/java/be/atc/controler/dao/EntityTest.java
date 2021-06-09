package be.atc.controler.dao;

import be.atc.controler.connexion.Factory;

import javax.persistence.*;

import be.atc.entities.UsersEnt;
import org.apache.log4j.Level;

import java.util.ArrayList;
import java.util.List;

public class EntityTest {
    final static         org.apache.log4j.Logger logger                = org.apache.log4j.Logger
            .getLogger( EntityTest.class );

    // Injection du manager, qui s'occupe de la connexion avec la BDD
    //@PersistenceContext( unitName = "UsersEnt" )
    public List<String> listDesPersonnes() {
        List<String> list = new ArrayList<>();
        try {
            System.out.println("Début du try");
            EntityManager em = EMF.getEM( );
            System.out.println("em:" + em);
            System.out.println("Déclaration du query");
            Query query = em.createQuery(
                    "select u from UsersEnt u ", UsersEnt.class );
            System.out.println("apres le query");
            System.out.println("Avant la liste");

            list = query.getResultList();
            System.out.println("apres la liste");

        } catch ( Exception e ) {
            System.out.println( "Erreur dans l'entityTest: "  + e);
        }
        return list;
    }
}
