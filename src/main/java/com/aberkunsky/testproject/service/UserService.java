package com.aberkunsky.testproject.service;

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

    public void saveUser(User user) {
        User localUser = userRepository.findByUserName(user.getUserName());
        if(localUser != null){
            System.out.println("user "+localUser.getUserName()+" alredy exists");
        } else {
            userRepository.save(user);
        }
    }

    public User findByUserName(String username){
        return userRepository.findByUserName(username);
    }
}
