package com.aberkunsky.testproject.controller;

import com.aberkunsky.testproject.exceptions.UserNotFoundException;
import com.aberkunsky.testproject.Validator.UserValidator;
import com.aberkunsky.testproject.model.User;
import com.aberkunsky.testproject.service.UserService;
import com.aberkunsky.testproject.userrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * user: alekseyb
 * date: 15.06.18
 */
@RestController
public class RegistrationController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @Autowired
    UserValidator userValidator;

    @RequestMapping(method = RequestMethod.POST, path = "/userservice/register")
    public User registerUser(@RequestBody User user) throws UserNotFoundException {
//        Errors errors = new FieldError();
//        userValidator.validate(user,);
        if(userService.findByUserName(user.getUserName())!=null){
            throw new UserNotFoundException(user.getUserName());
        }
        userService.saveUser(user);
        System.out.println(userRepository.findAll());
        return user;
    }
}
