package com.aberkunsky.testproject.encoder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.regex.Pattern;

/**
 * Created by admin on 6/17/2018.
 */
@Component
public class BCryptPasswordEncoder {
    public String hashPassword(String plainTextPassword){
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

}
