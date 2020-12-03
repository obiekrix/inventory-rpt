/**
 *
 */
package org.task.mint.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.task.mint.entity.Order;
import org.task.mint.model.OrderRpt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @author Christian
 *
 */
@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    Session currentSession;

    private void init() {
        currentSession = sessionFactory.getCurrentSession();
    }

    @Override
    public Order getOrder(int id) {
        // TODO Auto-generated method stub

        // get the current hibernate session
        init();

        //retrieve/read from database using the primary key
        Order theOrder = currentSession.get(Order.class, id);

        return theOrder;
    }

    @Override
    public List<OrderRpt> getOrdersByDateRange(String start, String end) {
        // TODO Auto-generated method stub

        init();

        // create a query ... sort by name
        Query<OrderRpt> theQuery = currentSession.createQuery("SELECT NEW org.task.mint.model.OrderRpt(o.timeOfSale as date, count(*) as total_order, sum(op.soldPrice) as total_order_amount) " +
                        "FROM Order as o INNER JOIN o.orderedProducts op " +
                        "WHERE o.timeOfSale BETWEEN '" + start + "' AND '" + end + "' " +
                        "GROUP BY o.timeOfSale",
                OrderRpt.class);

        // execute query and get result list
        List<OrderRpt> orders = theQuery.getResultList();

        // return the results
        return orders;
    }

}
