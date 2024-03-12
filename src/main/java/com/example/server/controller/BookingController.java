package com.example.server.controller;

import com.example.server.entity.BookingDto;
import com.example.server.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/api")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public List<BookingDto> getBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/booking")
    public void addBooking(@RequestBody BookingDto booking) {
        bookingService.addBooking(booking);
    }

    @GetMapping("/booking/{id}")
    public BookingDto getBooking(@PathVariable long id) {
        return bookingService.getBooking(id);
    }

    @DeleteMapping("/booking/{id}")
    public void deleteBooking(@PathVariable long id) {
        bookingService.deleteBooking(id);
    }
}
