package com.haulmomt.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by MRSMITH on 21.08.2017.
 */
public interface DAO<T,Id extends Serializable> {

    public void persist(T entity)throws SQLException;

    public void update(T entity)throws SQLException;

    public void delete(T entity)throws SQLException;

    public T findById(Id id)throws SQLException;

    public List<T> findAll()throws SQLException;

    public  void deleteAll()throws SQLException;
}
