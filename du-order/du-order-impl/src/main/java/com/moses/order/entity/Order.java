package com.moses.order.entity;


import com.moses.common.enums.OrderStatus;

import javax.persistence.*;

@Entity
@Table(name="order")
public class Order {
    @Id
    private int orderId;
    private int userId;
    private String from;
    private String to;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
