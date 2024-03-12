package com.example.server.mapper;

import com.example.server.entity.ItemDto;
import com.example.server.entity.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",  unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ItemMapper {
    ItemDto toDto(ItemEntity itemEntity);
    List<ItemDto> toDtoList(List<ItemEntity> itemEntities);
    ItemEntity toEntity(ItemDto itemDto);
}
