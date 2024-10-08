-- -- AppUser 테이블 생성
-- CREATE TABLE IF NOT EXISTS app_user (
--                                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
--                                         username VARCHAR(255)  ,
--                                         password VARCHAR(255) ,
--                                         email VARCHAR(255) ,
--                                         first_name VARCHAR(255) ,
--                                         last_name VARCHAR(255)
-- );
--
-- -- Role 테이블 생성
-- CREATE TABLE IF NOT EXISTS role (
--                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--                                     name VARCHAR(255) ,
--                                     description VARCHAR(255) ,
--                                     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--                                     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
-- );
--
-- -- UserRole 테이블 생성
-- CREATE TABLE IF NOT EXISTS user_role (
--                                          user_id BIGINT ,
--                                          role_id BIGINT ,
--                                          PRIMARY KEY (user_id, role_id),
--                                          FOREIGN KEY (user_id) REFERENCES app_user(id),
--                                          FOREIGN KEY (role_id) REFERENCES role(id)
-- );

-- 로그인 할때 사용할 테이블
CREATE TABLE Users (
       user_id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(50) UNIQUE,
       email VARCHAR(100) UNIQUE,
       password_hash VARCHAR(255) NOT NULL,
       first_name VARCHAR(50),
       last_name VARCHAR(50),
       birth_date DATE,
       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
       is_active BOOLEAN DEFAULT TRUE,
       role ENUM('admin', 'user') DEFAULT 'user'
);

CREATE TABLE Email_Verifications (
     user_id INT,
     verification_code VARCHAR(100),
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     expires_at TIMESTAMP,
     FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE Login_History (
   login_id INT AUTO_INCREMENT PRIMARY KEY,
   user_id INT,
   login_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   ip_address VARCHAR(45),
   user_agent TEXT,
   FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

