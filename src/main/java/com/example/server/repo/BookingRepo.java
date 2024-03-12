package com.example.server.repo;

import com.example.server.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<BookingEntity, Long> {
}
