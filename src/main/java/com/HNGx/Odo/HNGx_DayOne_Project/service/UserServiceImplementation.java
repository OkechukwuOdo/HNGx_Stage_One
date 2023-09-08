package com.HNGx.Odo.HNGx_DayOne_Project.service;

import com.HNGx.Odo.HNGx_DayOne_Project.entity.UserEntity;
import com.HNGx.Odo.HNGx_DayOne_Project.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImplementation {
    private final UserRepo userRepo;
    public List<UserEntity> getUser(String slack_name,String track){
        List<UserEntity> list=userRepo.findAllUsers();
        log.info("fdf {}",list);
               List<UserEntity> nice= list .stream().filter(p->p.getSlack_name().equalsIgnoreCase(slack_name)
                               && p.getTrack().equalsIgnoreCase(track))
                .toList();
        return nice;

    }
   }
