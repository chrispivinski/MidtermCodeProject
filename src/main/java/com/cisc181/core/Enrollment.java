package com.cisc181.core;

import java.util.UUID;

public class Enrollment{

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	public UUID getSectionID()
	{
		return this.SectionID;
	}
	public UUID getStudentID()
	{
		return this.StudentID;
	}
	public UUID getEnrollmentID()
	{
		return this.EnrollmentID;
	}
	
	private Enrollment() {
	}
	
	/**
	 * <b>Enrollment Constructor</b> - Creates and instance of Enrollment
	 * @param StudentId
	 * @param SectionID
	 * @param EnrollmentID
	 */
	
	public Enrollment(UUID SectionID, UUID StudentID)
	{
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	/**
	 * setGrade - setter for Grade
	 * @param Grade
	 */
	
	
	public void setGrade(double Grade) {
		this.Grade = Grade;
	}
}
