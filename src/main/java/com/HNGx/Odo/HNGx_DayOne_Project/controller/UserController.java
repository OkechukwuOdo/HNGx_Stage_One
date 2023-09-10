package com.HNGx.Odo.HNGx_DayOne_Project.controller;

import com.HNGx.Odo.HNGx_DayOne_Project.entity.UserEntity;
import com.HNGx.Odo.HNGx_DayOne_Project.service.UserServiceImplementation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private  final UserServiceImplementation userServiceImplementation;
    @GetMapping()
    public ResponseEntity<UserEntity> getUser(@RequestParam(value = "slack_name") String slack_name,
                                                       @RequestParam(value = "track") String track)
            {
                log.info("controller");
                UserEntity u=userServiceImplementation.getUser(slack_name,track);
        return ResponseEntity.ok(u);
    }
}
