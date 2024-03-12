package com.example.server.repo;

import com.example.server.entity.GoatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoatRepo extends JpaRepository<GoatEntity, Long> {
}
