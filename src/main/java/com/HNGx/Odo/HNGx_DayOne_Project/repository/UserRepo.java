package com.HNGx.Odo.HNGx_DayOne_Project.repository;

import com.HNGx.Odo.HNGx_DayOne_Project.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Repository
@Slf4j
public class UserRepo {

    List<UserEntity> userEntityList= List.of(
            new UserEntity("OsmondOdo", LocalDate.now().getDayOfWeek(),Instant.now(),"Backend","https://github.com/OkechukwuOdo/HNGx_Stage_One.git","https://github.com/OkechukwuOdo/HNGx_Stage_One/blob/main/src/main/java/com/HNGx/Odo/HNGx_DayOne_Project/HnGxDayOneProjectApplication.java", 200),
            new UserEntity("Osmond", LocalDate.now().getDayOfWeek(),Instant.now(),"Frontend","https://github.com/OkechukwuOdo/HNGx_Stage_One.git","https://github.com/OkechukwuOdo/HNGx_Stage_One/blob/main/src/main/java/com/HNGx/Odo/HNGx_DayOne_Project/HnGxDayOneProjectApplication.java",200),
            new UserEntity("Okechukwu_Odo", LocalDate.now().getDayOfWeek(),Instant.now(),"UI/UX","https://github.com/OkechukwuOdo/HNGx_Stage_One.git","https://github.com/OkechukwuOdo/HNGx_Stage_One/blob/main/src/main/java/com/HNGx/Odo/HNGx_DayOne_Project/HnGxDayOneProjectApplication.java",200),
            new UserEntity("Okey Odo", LocalDate.now().getDayOfWeek(),Instant.now(),"C#","https://github.com/OkechukwuOdo/HNGx_Stage_One.git","https://github.com/OkechukwuOdo/HNGx_Stage_One/blob/main/src/main/java/com/HNGx/Odo/HNGx_DayOne_Project/HnGxDayOneProjectApplication.java",200),
            new UserEntity("Odo Okechukwu", LocalDate.now().getDayOfWeek(),Instant.now(),"C++","https://github.com/OkechukwuOdo/HNGx_Stage_One.git","https://github.com/OkechukwuOdo/HNGx_Stage_One/blob/main/src/main/java/com/HNGx/Odo/HNGx_DayOne_Project/HnGxDayOneProjectApplication.java",200)
    );

    public List<UserEntity> findAllUsers(){
        log.info("call list");
        return userEntityList;
    }

}
