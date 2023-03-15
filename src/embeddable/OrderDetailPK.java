package embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;

//====== Composite-id class

@Embeddable
public class OrderDetailPK implements Serializable {
    private double itemCode;
    private int orderId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(double itemCode, int orderId) {
        this.itemCode = itemCode;
        this.orderId = orderId;
    }

    public double getItemCode() {
        return itemCode;
    }

    public void setItemCode(double itemCode) {
        this.itemCode = itemCode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
