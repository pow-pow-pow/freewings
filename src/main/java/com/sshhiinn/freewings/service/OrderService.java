package com.sshhiinn.freewings.service;

import com.sshhiinn.freewings.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
            this.orderRepository = orderRepository;
    }

}
