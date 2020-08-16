package com.moses.web.controller;

import com.moses.order.api.OrderApi;
import com.moses.order.vo.OrderVo;
import com.moses.user.api.UserApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @DubboReference
    OrderApi orderApi;

    @GetMapping("/findOrder")
    public OrderVo findByOrderId(@RequestParam int orderId){
        return orderApi.findByOrderId(orderId);
    }



}
