package com.project.moneyismine.repository;

import com.project.moneyismine.entity.QUsers;
import com.project.moneyismine.entity.Users;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@AllArgsConstructor
public class UsersRepositoryImpl implements UsersRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;
    QUsers user = QUsers.users;

    @Override
    public Optional<Users> userlist(Long userId) {

        Users findUser = jpaQueryFactory
                .selectFrom(user)
                .where(user.userId.eq(userId))
                .fetchOne();

        return Optional.ofNullable(findUser);
    }

    @Override
    public Optional<Users> userName(String username){
        Users findName = jpaQueryFactory
                .selectFrom(user)
                .where(user.username.eq(username))
                .fetchOne();
        return Optional.ofNullable(findName);
    }
}
