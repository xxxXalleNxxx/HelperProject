package ru.arapov.helperproject.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.arapov.helperproject.models.LoginResponseDTO;
import ru.arapov.helperproject.models.User;
import ru.arapov.helperproject.repositories.UserRepository;

@Service
@Transactional
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    public User registerUser(String username, String password, Integer age, String email){

        String encodedPassword = passwordEncoder.encode(password);

        return userRepository.save(new User(username, encodedPassword, age, email));
    }

    public LoginResponseDTO loginUser(String username, String password) {

        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

            return new LoginResponseDTO(userRepository.findByUsername(username).get(), password);

        } catch (AuthenticationException e) {
            return new LoginResponseDTO(null, "");
        }

    }

}
