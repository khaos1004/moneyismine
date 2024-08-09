-- ROLE 데이터 삽입
INSERT INTO ROLE (name, description) VALUES ('ADMIN', 'Administrator ROLE');
INSERT INTO ROLE (name, description) VALUES ('USER', 'User ROLE');

-- AppUser 데이터 삽입
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user1', 'password1', 'user1@example.com', 'First1', 'Last1');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user2', 'password2', 'user2@example.com', 'First2', 'Last2');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user3', 'password3', 'user3@example.com', 'First3', 'Last3');

-- 총 20개의 사용자 데이터 삽입
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user4', 'password4', 'user4@example.com', 'First4', 'Last4');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user5', 'password5', 'user5@example.com', 'First5', 'Last5');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user6', 'password6', 'user6@example.com', 'First6', 'Last6');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user7', 'password7', 'user7@example.com', 'First7', 'Last7');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user8', 'password8', 'user8@example.com', 'First8', 'Last8');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user9', 'password9', 'user9@example.com', 'First9', 'Last9');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user10', 'password10', 'user10@example.com', 'First10', 'Last10');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user11', 'password11', 'user11@example.com', 'First11', 'Last11');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user12', 'password12', 'user12@example.com', 'First12', 'Last12');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user13', 'password13', 'user13@example.com', 'First13', 'Last13');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user14', 'password14', 'user14@example.com', 'First14', 'Last14');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user15', 'password15', 'user15@example.com', 'First15', 'Last15');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user16', 'password16', 'user16@example.com', 'First16', 'Last16');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user17', 'password17', 'user17@example.com', 'First17', 'Last17');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user18', 'password18', 'user18@example.com', 'First18', 'Last18');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user19', 'password19', 'user19@example.com', 'First19', 'Last19');
INSERT INTO APP_USER (username, password, email, first_name, last_name) VALUES ('user20', 'password20', 'user20@example.com', 'First20', 'Last20');

-- UserRole 데이터 삽입
INSERT INTO USER_ROLE (user_id, role_id) VALUES (1, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (2, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (3, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (4, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (5, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (6, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (7, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (8, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (9, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (10, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (11, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (12, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (13, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (14, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (15, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (16, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (17, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (18, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (19, 2);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (20, 2);

-- 첫 번째 계정 추가 (admin)
INSERT INTO Users (username, email, password_hash, first_name, last_name, birth_date, role)
VALUES (
           'admin_user',
           'admin@example.com',
           'hashed_password_1',  -- 이 부분은 실제로 해시된 비밀번호로 교체해야 합니다.
           'Admin',
           'User',
           '1980-01-01',
           'admin'
       );

-- 두 번째 계정 추가 (user)
INSERT INTO Users (username, email, password_hash, first_name, last_name, birth_date, role)
VALUES (
           'regular_user',
           'user@example.com',
           'hashed_password_2',  -- 이 부분도 실제로 해시된 비밀번호로 교체해야 합니다.
           'Regular',
           'User',
           '1990-01-01',
           'user'
       );
