package com.example.server.service;

import com.example.server.entity.UserDto;
import com.example.server.entity.UserEntity;
import com.example.server.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService (UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public List<UserDto> getAllUsers(){
        List<UserEntity> userEntities = userRepo.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        for (UserEntity userEntity : userEntities) {
            UserDto userDto = new UserDto(
                    userEntity.getName(),
                    userEntity.getEmail());
            userDtos.add(userDto);
        }
        return userDtos;
    }

}
