package com.hospitalportal.base.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "patient_details")
public class PatientDetails {

	public PatientDetails(String id, String firstName, String lastName, String email, String paymentMethod,
			String insuranceProvider, int age, char gender, String height, int weight, String bmi,
			String medicalConditions, String phone, String emergencyContact, Patient patient) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.paymentMethod = paymentMethod;
		this.insuranceProvider = insuranceProvider;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.medicalConditions = medicalConditions;
		this.phone = phone;
		this.emergencyContact = emergencyContact;
		this.patient = patient;
	}

	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "patient_details_id")
	private String id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "payment_method")
	private String paymentMethod;
	@Column(name = "insurance_provider")
	private String insuranceProvider;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private char gender;
	@Column(name = "height")
	private String height;
	@Column(name = "weight")
	private int weight;
	@Column(name = "bmi")
	private String bmi;
	@Column(name = "medical_conditions")
	private String medicalConditions;
	@Column(name = "phone")
	private String phone;
	@Column(name = "emergency_contact")
	private String emergencyContact;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	   @OneToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "patientId")
	   private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public String getMedicalConditions() {
		return medicalConditions;
	}

	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

}