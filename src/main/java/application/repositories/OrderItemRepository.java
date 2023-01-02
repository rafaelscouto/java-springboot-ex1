package application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
