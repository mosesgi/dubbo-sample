package com.moses.order.api;

import com.moses.order.vo.OrderVo;

public interface OrderApi {
    OrderVo findByOrderId(int orderId);

    int createOrder(OrderVo orderVo);

    boolean updateOrder(OrderVo orderVo);
}
