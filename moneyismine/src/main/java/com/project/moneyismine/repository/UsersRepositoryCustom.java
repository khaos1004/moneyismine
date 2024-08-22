package com.project.moneyismine.repository;

import com.project.moneyismine.entity.Users;

import java.util.Optional;

public interface UsersRepositoryCustom {
    Optional<Users> userlist(Long userId);
}
