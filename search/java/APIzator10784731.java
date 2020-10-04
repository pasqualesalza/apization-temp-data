package com.stackoverflow.api;

import android.content.res.Configuration;
import org.h2.engine.Session;
import org.h2.engine.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Create session factory in Hibernate 4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10784731">https://stackoverflow.com/a/10784731</a>
 */
public class APIzator10784731 {

  public static void testConnection() throws Exception {
    logger.info("Trying to create a test connection with the database.");
    Configuration configuration = new Configuration();
    configuration.configure("hibernate_sp.cfg.xml");
    StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder()
    .applySettings(configuration.getProperties());
    SessionFactory sessionFactory = configuration.buildSessionFactory(
      ssrb.build()
    );
    Session session = sessionFactory.openSession();
    logger.info("Test connection with the database created successfuly.");
  }
}
