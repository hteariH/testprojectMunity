package com.aberkunsky.testproject.userrepository;

import com.aberkunsky.testproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * user: alekseyb
 * date: 15.06.18
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    public User findByUserName(String username);
}
