package com.rb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rb.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCategory(String category);


}
