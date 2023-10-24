package ru.arapov.helperproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arapov.helperproject.models.User;
import ru.arapov.helperproject.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return  repository.saveAll(users);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(int id) {
        return repository.findById(id).orElse(null);
    }

    public User getUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    public String deleteUser(int id) {
        repository.deleteById(id);
        return "User removed !\n id: " + id;
    }
}
