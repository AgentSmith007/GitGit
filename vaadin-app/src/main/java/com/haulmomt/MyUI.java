package com.haulmomt;

import javax.servlet.annotation.WebServlet;

import com.haulmomt.dao.CustomerDAO;
import com.haulmomt.dao.OrderDAO;
import com.haulmomt.entity.Customer;
import com.haulmomt.entity.Order;
import com.haulmomt.form.CustomerForm;
import com.haulmomt.form.OrderForm;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import java.util.Date;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
    private CustomerDAO customerService = new CustomerDAO();
    private OrderDAO orderService = new OrderDAO();
    private String[] option = {"Клиенты","Заказы"};
    private NativeSelect chooseList = new NativeSelect("Выбор списка");
    private NativeSelect chooseStatus = new NativeSelect("Выбор статуса");
    private NativeSelect chooseCustomer = new NativeSelect("Выбор клиента");
    private CssLayout filtering = new CssLayout();
    private Grid gridCustomers = new Grid();
    private Grid gridOrders = new Grid();
    private TextField filterText = new TextField();

    private Button buttonFilter = new Button(FontAwesome.TIMES);
    private Button buttonApplyFilter = new Button("Применить фильтр");
    private Button buttonAddCustomer = new Button("Добавить клиента");
    private Button buttonAddOrder = new Button("Добавить заказ");
    private Button buttonEditCustomer = new Button("Изменить клиента");
    private Button buttonEditOrder = new Button("Изменить заказ");
    private Button buttonDeleteCustomer = new Button("Удалить клиента");
    private Button buttonDeleteOrder = new Button("Удалить заказ  ");


    private EditWindow editWindow = new EditWindow();
   // private OrderForm orderForm = new OrderForm(this);
    private OrderForm orderForm =new OrderForm();
    private CustomerForm customerForm = new CustomerForm(this);

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        getPage().setTitle("Автомастерская");
        //Главный layout
        VerticalLayout layout = new VerticalLayout();
        final TextField name = new TextField();
        name.setCaption("Type your name here:");
        Button button = new Button("Click Me");
        layout.addComponents(button,name);
        setContent(layout);
        //Выбор нужного для работы списка

        /*
        *
        * Меню с кнопками и фильтрами
        * фильтр для order
        *
        * */


        filterText.setWidth(250 , Unit.PIXELS);
//        buttonFilter.addClickListener(e -> {
//            filterText.clear();
//            gridOrders.setContainerDataSource(new BeanItemContainer<>(Order.class ,
//                    orderService.findAll(filterText.getValue().toString() ,
//                            chooseStatus.getValue() == null ? null : (OrderStatus)chooseStatus.getValue() ,
//                            chooseCustomer.getValue() == null ? null : (((Customer)(chooseCustomer.getValue())).getId()))));
//
//        });
//        filtering.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
//        filtering.addComponents(filterText,buttonFilter);

   }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
