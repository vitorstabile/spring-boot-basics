package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.OrderItem;
import com.ecommerce.order.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
