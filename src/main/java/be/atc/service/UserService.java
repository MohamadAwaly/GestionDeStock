package be.atc.service;

import be.atc.controler.dao.EMF;
import be.atc.entities.UsersEnt;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UserService {
    private static Logger log = Logger.getLogger(UserService.class);
    EntityManager em = EMF.getEM();

    public UsersEnt test() {
        Query query = em.createNamedQuery("User.findall");
        UsersEnt user = (UsersEnt) query.getSingleResult();
        return user;
    }
}
