package com.example.collegeApi.services;

import java.util.List;

import com.example.collegeApi.models.CollegeResponse;

public interface CollegeService {
	public List<CollegeResponse> getAllColleges();

	public CollegeResponse getCollegeByCourse(String courseName);
}
