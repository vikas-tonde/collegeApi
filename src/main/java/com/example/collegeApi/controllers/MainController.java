package com.example.collegeApi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeApi.services.CollegeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colleges")
public class MainController {
	
	private CollegeService collegeService;
	
	@GetMapping
	public ResponseEntity<?> getAllCollege(){
		return ResponseEntity.ok(collegeService.getAllColleges());
	}
	
	@GetMapping("/{courseName}")
	public ResponseEntity<?> getCollegeByCourseName(@PathVariable String courseName){
		return ResponseEntity.ok(collegeService.getCollegeByCourse(courseName));
	}
}
