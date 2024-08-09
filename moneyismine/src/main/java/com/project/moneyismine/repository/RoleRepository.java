package com.project.moneyismine.repository;

import com.project.moneyismine.entity.Role;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {

//    @Autowired
//    private JPAQueryFactory queryFactory;
//
//    public List<Role> findUsersByName(String name) {
//        return queryFactory.selectFrom(Role)
//                .where(Role.username.eq(name))
//                .fetch();
//    }

}
