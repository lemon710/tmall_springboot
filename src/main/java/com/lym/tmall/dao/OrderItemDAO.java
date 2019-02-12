package com.lym.tmall.dao;

import com.lym.tmall.pojo.Order;
import com.lym.tmall.pojo.OrderItem;
import com.lym.tmall.pojo.Product;
import com.lym.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}