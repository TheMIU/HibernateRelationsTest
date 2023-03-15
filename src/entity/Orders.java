package entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    private LocalDate date;

    @ManyToOne
    private Customer customer;

    /*
    //Many to Many Without OrderDetails class
    @ManyToMany (mappedBy = "ordersList")
    private List<Item> itemList = new ArrayList<>();
    */

    //Many to Many with OrderDetails class
    @OneToMany(mappedBy = "orders")
    private List<OrderDetails> orderDetailsList = new ArrayList<>();

    public Orders() {
    }

    public Orders(int orderID, LocalDate date) {
        this.orderID = orderID;
        this.date = date;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    /*
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
*/

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

  /*  @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", date=" + date +
                ", customer=" + customer +
                '}';
    }*/
}
