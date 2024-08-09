package com.project.moneyismine.controller;

import com.project.moneyismine.entity.AppUser;
import com.project.moneyismine.entity.User;
import com.project.moneyismine.repository.UsersRepository;
import com.project.moneyismine.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {
    private UserService userService;
    private final UsersRepository usersRepository;

//    @GetMapping("/insertUser")
//    public ResponseEntity<Optional<AppUser>> InsertUserService(String username) {
//        Optional<AppUser> userInfo = Optional.ofNullable(userService.getUserInfo(username));
//        return userInfo.map(info -> ResponseEntity.ok(userInfo)).orElse(ResponseEntity.notFound().build());
//    }

//    @GetMapping("/getUser")
//    public ResponseEntity<Optional<AppUser>> getUserService(String username) {
//        Optional<AppUser> userInfo = userService.getUserName(username);
//        return userInfo.map(info -> ResponseEntity.ok(userInfo)).orElse(ResponseEntity.notFound().build());
//    }



//    @GetMapping("/list")
//    public ResponseEntity<?> getAlarmList(AlarmListRequestDTO alarmListRequestDTO) {
//
//        List<AlarmListResponseDTO> result = alarmService.alarmList(alarmListRequestDTO);
//        int count = alarmService.alarmListCount(alarmListRequestDTO);
//        int listSize = result.size();
//
//        if (!result.isEmpty()) {
//            return ResponseEntity.ok(Map.of("ok", true, "count", listSize, "totalCount", count, "result", result));
//        }
//
//        return ResponseEntity.ok(Map.of("ok", false, "result", result));
//    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        Optional<User> user = usersRepository.findByUsername(username);
        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
