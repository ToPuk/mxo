package com.mxo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mxo.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsUserByEmail(String email);
    Optional<User> findByEmail(String email);
}
