package com.assignment.database.model2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class user2{
	@Id
	@GeneratedValue
	private int id;
	private String patientname;
	private String name;
	private String time;
	private String duration;
	private String doctorname;
	private String venue;
	private int zipcode;
}