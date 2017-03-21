package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;


public class Course extends Semester {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;

	/**
	 * Course's no-arg constructor
	 */
	public Course() {
	}

	/**
	 * <b>Course Constructor</b> - Creates an instance of course
	 * 
	 * @param SemesterID
	 * @param StartDate
	 * @param EndDate
	 * @param CourseID
	 * @param CourseName
	 * @param GradePoints
	 * @param eMajor
	 */

	public Course(UUID SemesterID, Date StartDate, Date EndDate, UUID CourseID, String CourseName, int GradePoints, eMajor eMajor) {
		super(SemesterID, StartDate, EndDate);
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.eMajor = eMajor;
	}
 
	/**
	 * setCourseID - Setter for CourseID field
	 * 
	 * @param CourseID
	 */
	public void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}

	public UUID getCourseID() {
		return this.CourseID;
	}

	/**
	 * setCourseName - Setter for CourseName field
	 * 
	 * @param CourseName
	 */
	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}

	public String getCourseName() {
		return this.CourseName;
	}

	/**
	 * setGradePoints - Setter for GradePoints field
	 * 
	 * @param GradePoints
	 */
	public void setGradePoints(int GradePoints) {
		this.GradePoints = GradePoints;
	}

	public int getGradePoints() {
		return this.GradePoints;
	}
	/**
	 * seteMajor - Setter for eMajor field
	 * 
	 * @param eMajor
	 */
	public void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}

	public eMajor geteMajor() {
		return this.eMajor;
	}
}
