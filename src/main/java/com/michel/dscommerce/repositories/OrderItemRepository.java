package com.michel.dscommerce.repositories;

import com.michel.dscommerce.entities.OrderItem;
import com.michel.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}


