package com.lym.tmall.dao;

import com.lym.tmall.pojo.Product;
import com.lym.tmall.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewDAO extends JpaRepository<Review,Integer> {
    List<Review> findByProductOrderByIdDesc(Product product);
    int countByProduct(Product product);
}
