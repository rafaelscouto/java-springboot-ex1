package application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
