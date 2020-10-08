package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("sisCadUsuario");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
