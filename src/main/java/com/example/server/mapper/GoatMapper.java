package com.example.server.mapper;

import com.example.server.entity.GoatDto;
import com.example.server.entity.GoatEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GoatMapper {
    GoatDto toDto(GoatEntity goatEntity);
    List<GoatDto> toDtoList(List<GoatEntity> goatEntities);
    GoatEntity toEntity(GoatDto goatDto);
}
