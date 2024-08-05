-- AppUser 테이블 생성
CREATE TABLE IF NOT EXISTS app_user (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        username VARCHAR(255) ,
                                        password VARCHAR(255) ,
                                        email VARCHAR(255) ,
                                        first_name VARCHAR(255) ,
                                        last_name VARCHAR(255) 
);

-- Role 테이블 생성
CREATE TABLE IF NOT EXISTS role (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                    name VARCHAR(255) ,
                                    description VARCHAR(255),
                                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- UserRole 테이블 생성
CREATE TABLE IF NOT EXISTS user_role (
                                         user_id BIGINT ,
                                         role_id BIGINT ,
                                         PRIMARY KEY (user_id, role_id),
                                         FOREIGN KEY (user_id) REFERENCES app_user(id),
                                         FOREIGN KEY (role_id) REFERENCES role(id)
);
