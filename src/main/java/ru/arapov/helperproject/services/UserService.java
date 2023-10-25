package ru.arapov.helperproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arapov.helperproject.models.Course;
import ru.arapov.helperproject.models.User;
import ru.arapov.helperproject.repositories.CourseRepository;
import ru.arapov.helperproject.repositories.UserRepository;

import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return  userRepository.saveAll(users);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User removed !\n id: " + id;
    }
}
