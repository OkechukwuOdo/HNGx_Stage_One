package com.HNGx.Odo.HNGx_DayOne_Project.service;

import com.HNGx.Odo.HNGx_DayOne_Project.entity.UserEntity;
import com.HNGx.Odo.HNGx_DayOne_Project.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImplementation {
    private final UserRepo userRepo;
        public Optional<UserEntity> getUser(String slack_name,String track){
        List<UserEntity> list=userRepo.findAllUsers();
        log.info("fdf {}",list);

               Optional<UserEntity> user=list .stream().filter(p->p.getSlack_name().equalsIgnoreCase(slack_name)
                       && p.getTrack().equalsIgnoreCase(track)).findFirst();
        return user;

    }
   }
