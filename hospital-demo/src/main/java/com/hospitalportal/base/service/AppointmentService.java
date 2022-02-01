package com.hospitalportal.base.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospitalportal.base.auth.UpcomingAppts;
import com.hospitalportal.base.repository.AppointmentRepository;
@Service
public class AppointmentService {
@Autowired
private AppointmentRepository apptRepo;
public AppointmentService(AppointmentRepository appointmentRepository) 
{
	this.apptRepo=appointmentRepository;
}
}
