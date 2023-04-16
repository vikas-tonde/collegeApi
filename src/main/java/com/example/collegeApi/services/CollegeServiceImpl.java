package com.example.collegeApi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.collegeApi.entities.College;
import com.example.collegeApi.models.CollegeResponse;
import com.example.collegeApi.models.CourseModel;
import com.example.collegeApi.repositories.CollegeRepository;
import com.example.collegeApi.repositories.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CollegeServiceImpl implements CollegeService {

	private CollegeRepository collegeRepository;
	private CourseRepository courseRepository;

	@Override
	public List<CollegeResponse> getAllColleges() {

		List<College> colleges = collegeRepository.findAll();
		List<CollegeResponse> response = colleges.stream().map(college -> new CollegeResponse(college.getId(),
				college.getCollegeName(), college.getAccomodation(), college.getAccomodationFee(),
				college.getCourses().stream()
						.map(course -> new CourseModel(course.getId(), course.getCourseName(), course.getCourseFee()))
						.collect(Collectors.toList())))
				.collect(Collectors.toList());
		return response;
	}

	@Override
	public CollegeResponse getCollegeByCourse(String courseName) {
		College college = courseRepository.findByCourseName(courseName).getCollege();

		return new CollegeResponse(college.getId(), college.getCollegeName(), college.getAccomodation(),
				college.getAccomodationFee(),
				college.getCourses().stream()
						.map(course -> new CourseModel(course.getId(), course.getCourseName(), course.getCourseFee()))
						.collect(Collectors.toList()));
	}

}
