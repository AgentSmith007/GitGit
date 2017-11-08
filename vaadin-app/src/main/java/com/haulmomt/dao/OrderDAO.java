package com.haulmomt.dao;

import com.haulmomt.busslogic.SessionUtil;
import com.haulmomt.entity.Order;
import org.hibernate.Session;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by MRSMITH on 21.08.2017.
 */
public class OrderDAO extends SessionUtil implements DAO<Order,Long> {


    public void delete(Order entity) throws SQLException {
        openTtransactionSession();
        Session session = getSession();
        session.delete(entity);

        closeTransactionSession();
    }

    public void delete(Long id) throws SQLException {
        openTtransactionSession();
        Order order = (Order)getSession().get(Order.class,id) ;
        delete(order);
        closeTransactionSession();

    }

    public Order findById(Long id)throws SQLException {
        openTtransactionSession();
        String sql ="SELECT * FROM CUSTOMER WHERE ID =id ";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Order.class);
        query.setParameter("id",id);

        Order order =(Order) query.getSingleResult();
        closeTransactionSession();

        return order;
    }

    public void persist(Order entity) throws SQLException {
        openTtransactionSession();
        Session session = getSession();
        session.save(entity);

        closeTransactionSession();

    }

    public void update(Order entity) throws SQLException {

        openTtransactionSession();
        Session session = getSession();
        session.update(entity);

        closeTransactionSession();
    }




    public List<Order> findAll() throws SQLException {

        openTtransactionSession();
        String sql = "SELECT * FROM CUSTOMER";
        Session session =getSession();
        Query query =session.createNativeQuery(sql).addEntity(Order.class);

        List<Order> orders = query.getResultList();

        return  orders;
    }

    public void deleteAll() throws SQLException{
        openTtransactionSession();
        String sql = "SELECT * FROM CUSTOMER";
        Session session =getSession();
        Query query =session.createNativeQuery(sql).addEntity(Order.class);
        List<Order> orders = query.getResultList();

        for (Order entity:orders
                ) {delete(entity);

        }
        closeTransactionSession();

    }
}
