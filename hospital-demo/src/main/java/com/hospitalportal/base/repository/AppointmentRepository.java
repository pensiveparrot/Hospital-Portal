package com.hospitalportal.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.UpcomingAppts;

public interface AppointmentRepository extends JpaRepository <UpcomingAppts,Integer> {
	UpcomingAppts findByID(int adminID);
	
}
