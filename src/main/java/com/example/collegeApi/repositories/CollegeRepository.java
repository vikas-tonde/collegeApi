package com.example.collegeApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeApi.entities.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
