package com.HNGx.Odo.HNGx_DayOne_Project.service;

import com.HNGx.Odo.HNGx_DayOne_Project.entity.UserEntity;
import com.HNGx.Odo.HNGx_DayOne_Project.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImplementation {
    private final UserRepo userRepo;
        public UserEntity getUser(String slack_name,String track){
        List<UserEntity> list=userRepo.findAllUsers();
        log.info("fdf {}",list);

               UserEntity user=list .stream().filter(p->p.getSlack_name().equalsIgnoreCase(slack_name)
                       && p.getTrack().equalsIgnoreCase(track)).findFirst().get();
               user.setCurrent_day(formartDayOfWeek(user.getCurrent_day()));
               user.setUtc_time(formatUtc(user.getUtc_time()));
        return user;

    }
private String formatUtc(String w){

    Instant currentUtcTime = Instant.now();

    // Create a DateTimeFormatter for the desired format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
            .withZone(ZoneOffset.UTC);

    // Format the Instant as a string in UTC format
    String formattedUtcTime = formatter.format(currentUtcTime);
            return formattedUtcTime;
}

    private String formartDayOfWeek(String p){
        return p.substring(0, 1).toUpperCase() + p.substring(1).toLowerCase();
    }
   }
