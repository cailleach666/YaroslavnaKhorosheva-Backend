package com.example.server.service;

import com.example.server.entity.BookingDto;
import com.example.server.entity.BookingEntity;
import com.example.server.mapper.BookingMapper;
import com.example.server.repo.BookingRepo;
import com.example.server.repo.ItemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepo bookingRepo;
    private final BookingMapper bookingMapper;

    public List<BookingDto> getAllBookings(){
        List<BookingEntity> bookingEntities = bookingRepo.findAll();
        return bookingMapper.toDtoList(bookingEntities);
    }
    public void addBooking(BookingDto booking) {
        BookingEntity entity = bookingMapper.toEntity(booking);
        bookingRepo.save(entity);
    }
    public BookingDto getBooking(long id) {
        BookingEntity booking = bookingRepo.getReferenceById(id);
        return bookingMapper.toDto(booking);
    }
    public void deleteBooking(long id) {
        bookingRepo.deleteById(id);
    }

}
