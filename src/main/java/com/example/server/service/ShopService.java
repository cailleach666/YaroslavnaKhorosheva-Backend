package com.example.server.service;

import com.example.server.entity.ItemDto;
import com.example.server.entity.ItemEntity;
import com.example.server.mapper.ItemMapper;
import com.example.server.repo.ItemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {
    private final ItemRepo itemRepo;
    private final ItemMapper itemMapper;

    public List<ItemDto> getAllItems(){
        List<ItemEntity> itemEntities = itemRepo.findAll();
        return itemMapper.toDtoList(itemEntities);
    }

    public void addItem(ItemDto item) {
        ItemEntity entity = itemMapper.toEntity(item);
        itemRepo.save(entity);
    }

    public ItemDto getItem(long id) {
        ItemEntity item = itemRepo.getReferenceById(id);
        return itemMapper.toDto(item);
    }
    public void deleteItem(long id) {
        itemRepo.deleteById(id);
    }

}
