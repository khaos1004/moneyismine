package com.project.moneyismine.controller;

import com.project.moneyismine.entity.AppUser;
import com.project.moneyismine.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {
    private UserService userService;

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
}
