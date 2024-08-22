package com.project.moneyismine.repository;

import com.project.moneyismine.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>, UsersRepositoryCustom {
    Optional<Users> findByUsername(String username);
    Optional<Users> findByUserId(Long userId); // 이 메서드는 QueryDSL이 아닌 기본 JPA 방식으로 사용
}
