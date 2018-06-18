package com.aberkunsky.testproject.service;

import com.aberkunsky.testproject.dto.UserDTO;
import com.aberkunsky.testproject.encoder.BCryptPasswordEncoder;
import com.aberkunsky.testproject.model.User;
import com.aberkunsky.testproject.userrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user: alekseyb
 * date: 15.06.18
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public void saveUser(UserDTO user) {

        User u = new User();
        u.setFirstName(user.getFirstName());
        u.setLastName(user.getLastName());
        u.setUserName(user.getUserName());
        u.setHashedPassword(passwordEncoder.hashPassword(user.getPlainTextPassword()));
        userRepository.save(u);

    }

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
