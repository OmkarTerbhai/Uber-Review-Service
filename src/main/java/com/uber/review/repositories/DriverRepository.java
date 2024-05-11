package com.uber.review.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.common.entities.Driver;


import java.util.UUID;

public interface DriverRepository extends JpaRepository<Driver, UUID> {
    public Driver findByName(String name);
}
