package com.haulmomt.busslogic;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by vserdiuk on 2/12/17.
 */
public class SessionUtil {


    private Session session;
    private Transaction transaction;

    public Session getSession() {
        return session;
    }

    public Transaction getTransaction() {
        return transaction;
    }


    public Session openSession(){return  HibernateUtil.getSessionFactory().openSession();}

    public Session openTtransactionSession(){
        session=openSession();
        transaction=session.beginTransaction();
        return session;
    }

    public void  closeSession(){session.close();}

    public void closeTransactionSession(){
        transaction.commit();
        session.close();
    }
}
