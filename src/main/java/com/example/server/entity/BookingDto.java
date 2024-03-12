package com.example.server.entity;

import java.sql.Timestamp;


public record BookingDto(Timestamp booking_start, Timestamp booking_end, Long user_id, Long goat_id) {
}
