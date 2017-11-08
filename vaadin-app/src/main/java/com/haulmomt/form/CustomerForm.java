package com.haulmomt.form;

import com.haulmomt.dao.CustomerDAO;
import com.haulmomt.MyUI;
import com.haulmomt.entity.Customer;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.*;

import java.awt.Button;
import java.awt.TextField;

/**
 * Created by MRSMITH on 23.08.2017.
 */
public class CustomerForm extends FormLayout{

    private TextField firstname  = new TextField("Имя");
    private TextField lastname  = new TextField("Фамилия");
    private TextField patronymic  = new TextField("Отчество");
    private TextField phonenumber  = new TextField("Телефон");

    private com.vaadin.ui.Button save = new com.vaadin.ui.Button("Сохранить", FontAwesome.SAVE);
    private  Button close = new Button("Отменить");

    private CustomerDAO customerDAO = new CustomerDAO();
    private Customer customer;
    private  boolean rightFormNumber = false;

    private  MyUI myUI;

    public CustomerForm(MyUI myUI){
        //Validator for number checking
        }
    }


