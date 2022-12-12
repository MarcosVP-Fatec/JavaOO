package pereira.vinicio.marcos.JavaOO.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

    private static PersistenceManager instance;

    private PersistenceManager() {}

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public static PersistenceManager getInstance() {
        if (instance == null) instance = new PersistenceManager();
        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) emf = Persistence.createEntityManagerFactory("javaoo");
        return emf;
    }

    public EntityManager getEntityManager() {
        if (em == null) em = getEntityManagerFactory().createEntityManager();
        return em;
    }
    
}
