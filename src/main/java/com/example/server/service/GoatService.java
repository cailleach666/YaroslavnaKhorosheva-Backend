package com.example.server.service;

import com.example.server.entity.GoatDto;
import com.example.server.entity.GoatEntity;
import com.example.server.repo.GoatRepo;
import com.example.server.mapper.GoatMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoatService {
    private final GoatRepo goatRepo;
    private final GoatMapper goatMapper;

    public List<GoatDto> getAllGoats(){
        List<GoatEntity> goatEntities = goatRepo.findAll();
        return goatMapper.toDtoList(goatEntities);
    }

    public void addGoat(GoatDto goat) {
        GoatEntity entity = goatMapper.toEntity(goat);
        goatRepo.save(entity);
    }

    public GoatDto getGoat(long id) {
        GoatEntity kits = goatRepo.getReferenceById(id);
        return goatMapper.toDto(kits);
    }

    public void deleteGoat(long id) {
        goatRepo.deleteById(id);
    }

}
