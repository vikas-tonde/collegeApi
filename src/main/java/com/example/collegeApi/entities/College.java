package com.example.collegeApi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String collegeName;
	private String accomodation;
	private double accomodationFee;
	
	@OneToMany(mappedBy = "college")
	private List<Course> courses;
	
}
