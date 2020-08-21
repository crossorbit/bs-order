
package cnabookstore.order;

import cnabookstore.order.AbstractEvent;

public class OrderCanceled extends AbstractEvent {

    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
