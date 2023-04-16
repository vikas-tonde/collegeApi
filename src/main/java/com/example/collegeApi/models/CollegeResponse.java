package com.example.collegeApi.models;

import java.util.List;

public record CollegeResponse(long collegId, String collegeName, String accomodation, double accomodationFee,
		List<CourseModel> courses) {

}
