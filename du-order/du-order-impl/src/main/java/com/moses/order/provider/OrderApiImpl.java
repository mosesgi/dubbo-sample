package com.moses.order.provider;

import com.moses.common.enums.OrderStatus;
import com.moses.order.api.OrderApi;
import com.moses.order.entity.Order;
import com.moses.order.vo.OrderVo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;

@DubboService(interfaceClass = OrderApi.class)
public class OrderApiImpl implements OrderApi {

    @Override
    public OrderVo findByOrderId(int orderId) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setUserId(1);
        order.setFrom("City A");
        order.setTo("City B");
        order.setStatus(OrderStatus.PENDING);
        OrderVo vo = new OrderVo();
        BeanUtils.copyProperties(order, vo);
        return vo;
    }

    @Override
    public int createOrder(OrderVo orderVo) {
        return 0;
    }

    @Override
    public boolean updateOrder(OrderVo orderVo) {
        return false;
    }
}
