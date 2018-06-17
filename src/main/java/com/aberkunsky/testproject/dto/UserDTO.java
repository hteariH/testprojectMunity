package com.aberkunsky.testproject.dto;

/**
 * Created by admin on 6/17/2018.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * user: alekseyb
 * date: 15.06.18
 */
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    private String plainTextPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @JsonIgnore
    public String getPlainTextPassword() {
        return plainTextPassword;
    }
    @JsonProperty
    public void setPlainTextPassword(String plainTextPassword) {
        this.plainTextPassword = plainTextPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", plainTextPassword='" + plainTextPassword + '\'' +
                '}';
    }
}

