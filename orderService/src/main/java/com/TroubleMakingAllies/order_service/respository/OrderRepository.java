package com.TroubleMakingAllies.order_service.respository;

import com.TroubleMakingAllies.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
