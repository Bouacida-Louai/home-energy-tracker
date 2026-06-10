package com.louaidev.userservice.service;

import com.louaidev.userservice.dto.UserDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {


    public UserDto createUser(UserDto userDto){
        log.info("Creating user with name: {}", userDto.getName());
        return userDto;
    }
}
