package com.example.server.repo;

import com.example.server.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemEntity, Long> {
}
