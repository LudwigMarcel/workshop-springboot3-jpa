package com.projetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.course.entities.OrderItem;
import com.projetospring.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
