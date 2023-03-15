package entity;

import embeddable.OrderDetailPK;

import javax.persistence.*;

@Entity
public class OrderDetails{
    @EmbeddedId
    private OrderDetailPK orderDetailPK;

    private double price;
    private int qty;

    @ManyToOne
    @JoinColumn (name = "orderId", insertable = false ,updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn (name = "itemCode", insertable = false ,updatable = false)
    private Item item;

    public OrderDetails() {
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
