package application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
