package com.project.moneyismine.repository;

import com.project.moneyismine.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    public Optional<User> findByUserId(Long userid);

}
