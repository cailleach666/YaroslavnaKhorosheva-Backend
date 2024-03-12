package com.example.server.mapper;
import com.example.server.entity.BookingDto;
import com.example.server.entity.BookingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookingMapper {
    BookingDto toDto(BookingEntity bookingEntity);
    List<BookingDto> toDtoList(List<BookingEntity> bookingEntities);

    BookingEntity toEntity(BookingDto bookingDto);
}
