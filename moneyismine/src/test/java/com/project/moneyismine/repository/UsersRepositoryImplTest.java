package com.project.moneyismine.repository;

import com.project.moneyismine.entity.Users;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest // Spring Boot 애플리케이션 컨텍스트를 로드하여 통합 테스트를 수행
@Transactional // 각 테스트가 끝날 때마다 롤백하여 테스트 간 간섭 방지
public class UsersRepositoryImplTest {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    void test() {
        System.out.println("HelloWorld!");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10})
    void parameterizedTest(int argument) {
        System.out.println(argument);
    }
}
