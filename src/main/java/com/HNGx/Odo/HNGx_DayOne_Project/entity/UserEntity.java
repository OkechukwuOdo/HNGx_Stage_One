package com.HNGx.Odo.HNGx_DayOne_Project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserEntity {
    private Long id;
    private String slack_name;
    private DayOfWeek current_day;
    private Instant utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;
}
