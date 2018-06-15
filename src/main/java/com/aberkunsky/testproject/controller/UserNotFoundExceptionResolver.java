package com.aberkunsky.testproject.controller;

import com.aberkunsky.testproject.Exceptions.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * user: alekseyb
 * date: 15.06.18
 */
@ControllerAdvice
public class UserNotFoundExceptionResolver {

    @ExceptionHandler(UserNotFoundException.class)
    public void resolveAndWriteException(Exception exception, HttpServletResponse response) throws IOException {
        int status=409;
        response.setStatus(status);
        response.setContentType("application/json");

        PrintWriter pw = new PrintWriter(response.getOutputStream());
        String str = "{\n" +
                "\"code\": \"USER_ALREADY_EXISTS\",\n" +
                "\"description\": \"A user with the given username already exists\"\n" +
                "}";
        pw.write(str);
        pw.close();

    }
}
