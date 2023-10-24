package ru.arapov.helperproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arapov.helperproject.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
