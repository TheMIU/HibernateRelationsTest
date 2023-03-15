import entity.Customer;
import entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class OneToMany_Test {
    public static void main(String[] args) {
        Session session = util.SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // Customer and Orders relationship

        Orders orders = new Orders();
        orders.setDate(LocalDate.now());

        // get exist customer and add order
        Customer customer = session.get(Customer.class,1);
        orders.setCustomer(customer);

        customer.getOrders().add(orders); // add orders to arraylist

        session.save(customer);
        session.save(orders);

        System.out.println(customer); // * entity wala toString eka override karot metana error ekak eno
        System.out.println(orders); // *
        System.out.println(orders.getCustomer()); // *

        transaction.commit();
        session.close();
    }
}
