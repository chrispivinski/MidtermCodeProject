package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public abstract class Semester implements java.io.Serializable{

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	public UUID getSemesterID() {
		return this.SemesterID;
	}
	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}
	public Date getStartDate() {
		return this.StartDate;
	}
	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}

	public Date getEndDate() {
		return this.EndDate;
	}
	public void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}
	
	/*
	 * Constructors No Arg Constructor
	 */
	public Semester() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Semester(UUID SemesterID, Date StartDate, Date EndDate)
	{
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public void PrintSemesterID() {
		System.out.println(this.SemesterID);
	}
	
	public void PrintStartDate() {
		System.out.println(this.StartDate);
	}
	
	public void PrintEndDate() {
		System.out.println(this.EndDate);
	}
}
