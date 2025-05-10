package com.designpatterns.saga;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
// OrderService.java
@Service
public class OrderService {
    @Autowired
    private EventPublisher eventPublisher;

    public void createOrder(Order order) {
        // Save order to the database
        order.setStatus("PENDING");
        saveOrder(order);

        // Publish event
        eventPublisher.publishEvent(new OrderCreatedEvent(order.getId()));
    }

    private void saveOrder(Order order) {
        System.out.println("Order saved: " + order);

    }

    private Order findOrderById(Long orderId) {
        // Simulate finding an order by ID
        Order order = new Order();
        order.setId(orderId);
        return  order; // Simulate finding an order by ID

    }

    public void cancelOrder(Long orderId) {
        // Update order status to CANCELLED
        Order order = findOrderById(orderId);
        order.setStatus("CANCELLED");
        saveOrder(order);
    }


}