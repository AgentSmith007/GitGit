package com.haulmomt.dao;

import com.haulmomt.busslogic.SessionUtil;
import com.haulmomt.entity.Customer;
import org.hibernate.Session;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by MRSMITH on 21.08.2017.
 */
public class CustomerDAO extends  SessionUtil implements DAO<Customer,Long> {

    public void persist(Customer entity) {

        openTtransactionSession();
        Session session = getSession();
        session.save(entity);

        closeTransactionSession();

    }

    public void update(Customer entity) {
        openTtransactionSession();
        Session session = getSession();
        session.update(entity);

        closeTransactionSession();
    }


    public void delete(Customer entity) throws SQLException {
        openTtransactionSession();
        Session session = getSession();
        session.delete(entity);

        closeTransactionSession();
    }

    public void delete(Long id) throws SQLException {
        openTtransactionSession();
        Customer customer = (Customer)getSession().get(Customer.class,id) ;
        delete(customer);
        closeTransactionSession();

    }

    public Customer findById(Long id) {
        openTtransactionSession();
        String sql ="SELECT * FROM CUSTOMER WHERE ID =id ";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Customer.class);
        query.setParameter("id",id);

        Customer customer =(Customer) query.getSingleResult();
        closeTransactionSession();

        return customer;
    }

    public List<Customer> findAll() throws SQLException {

        openTtransactionSession();
        String sql = "SELECT * FROM CUSTOMER";
        Session session =getSession();
        Query query =session.createNativeQuery(sql).addEntity(Customer.class);

        List<Customer> customers = query.getResultList();

        return  customers;
    }

    public void deleteAll() throws SQLException{
        openTtransactionSession();
        String sql = "SELECT * FROM CUSTOMER";
        Session session =getSession();
        Query query =session.createNativeQuery(sql).addEntity(Customer.class);
        List<Customer> customers = query.getResultList();

        for (Customer entity:customers
             ) {delete(entity);

        }
        closeTransactionSession();

    }
}
