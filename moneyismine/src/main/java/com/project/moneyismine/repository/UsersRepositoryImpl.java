package com.project.moneyismine.repository;

import com.project.moneyismine.entity.QUsers;
import com.project.moneyismine.entity.Users;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@AllArgsConstructor
public class UsersRepositoryImpl implements UsersRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Optional<Users> userlist(Long userId) {
        QUsers user = QUsers.users;

        Users findUser = jpaQueryFactory
                .selectFrom(user)
                .where(user.userId.eq(userId))
                .fetchOne();

        return Optional.ofNullable(findUser);
    }
}
