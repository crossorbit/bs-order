
package cnabookstore.order;

public class OrderCanceled extends AbstractEvent {

    private Long orderId;

    public Long getId() {
        return orderId;
    }

    public void setId(Long orderId) {
        this.orderId = orderId;
    }
}
