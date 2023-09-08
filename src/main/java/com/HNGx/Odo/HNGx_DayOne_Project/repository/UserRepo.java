package com.HNGx.Odo.HNGx_DayOne_Project.repository;

import com.HNGx.Odo.HNGx_DayOne_Project.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Repository
@Slf4j
public class UserRepo {

    List<UserEntity> userEntityList= List.of(
            new UserEntity(1L,"Odo Osmond", LocalDate.now().getDayOfWeek(), Instant.now(),"Java","","",200),
            new UserEntity(2L,"Osmond Odo", LocalDate.now().getDayOfWeek(), Instant.now(),"Node","","",200),
            new UserEntity(3L,"Okechukwu Odo", LocalDate.now().getDayOfWeek(), Instant.now(),"Python","","",200),
            new UserEntity(4L,"Okey Odo", LocalDate.now().getDayOfWeek(), Instant.now(),"C#","","",200),
            new UserEntity(5L,"Odo Okechukwu", LocalDate.now().getDayOfWeek(), Instant.now(),"C++","","",200)
    );

    public List<UserEntity> findAllUsers(){
        log.info("call list");
        return userEntityList;
    }

}
