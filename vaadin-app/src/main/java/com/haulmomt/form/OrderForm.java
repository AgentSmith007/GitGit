package com.haulmomt.form;

import com.haulmomt.dao.CustomerDAO;
import com.haulmomt.dao.OrderDAO;
import com.haulmomt.EditWindow;
import com.haulmomt.MyUI;
import com.haulmomt.entity.Order;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.*;


import java.awt.Button;
import java.awt.TextField;

/**
 * Created by MRSMITH on 23.08.2017.
 */
public class OrderForm {

    private TextField description = new TextField("Описание");
    private NativeSelect сustomer = new NativeSelect("Клиент");
    //private PopupDateField createDate = new PopupDateField("Дата создания");
    //private PopupDateField finishDate = new PopupDateField("Дата окончания");
    private TextField createDate = new TextField("Дата создания");
    private TextField finishDate = new TextField("Дата окончания");
    private TextField cost = new TextField("Cтоимость");
    private NativeSelect orderStatement = new NativeSelect("Статус");

    private com.vaadin.ui.Button save = new com.vaadin.ui.Button("Сохранить", FontAwesome.SAVE);
    private Button close = new Button("Отменить");

    private OrderDAO orderService = new OrderDAO();
    private CustomerDAO customerService = new CustomerDAO();
    private Order order;
    private MyUI myUI;
    private EditWindow editWindow;
    private boolean rightForm = false;


}

