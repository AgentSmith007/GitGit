package com.haulmomt.busslogic;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by vserdiuk on 2/8/2017.
 */
public class HibernateUtil {

    public static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutDown(){ getSessionFactory().close();}
}
