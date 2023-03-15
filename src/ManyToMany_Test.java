import embeddable.OrderDetailPK;
import entity.Item;
import entity.OrderDetails;
import entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryConfiguration;


public class ManyToMany_Test {
    public static void main(String[] args) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*
        // add Item
        Item item = new Item();
        item.setDescription("Soap");
        item.setUnitPrice(150)testsample;
        item.setQtyOnHand(10);
        session.save(item);
        */

        // Order & Item Relationship

        // get exist order
        Orders orders = session.get(Orders.class, 1);

        // get exist item
        Item item = session.get(Item.class, 1);

        /*
        //Many to Many Without OrderDetails class
        orders.getItemList().add(item);
        item.getOrdersList().add(orders);
        */

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrderDetailPK(new OrderDetailPK(item.getItemCode(), orders.getOrderID()));
        orderDetails.setQty(2);
        orderDetails.setPrice(300);

        session.save(orders);
        session.save(orderDetails);

        transaction.commit();
        session.close();
    }
}
