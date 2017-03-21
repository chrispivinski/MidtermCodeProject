package com.cisc181.core;

import java.util.UUID;

public class Section extends Course {

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	public void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}

	public UUID getCourseID() {
		return this.CourseID;
	}

	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}

	public UUID getSemesterID() {
		return this.SemesterID;
	}

	public void setSectionID(UUID SectionID) {
		this.SectionID = SectionID;
	}

	public UUID getSectionID() {
		return this.SectionID;
	}

	public void setRoomID(int RoomID) {
		this.RoomID = RoomID;
	}

	public int RoomID() {
		return this.RoomID;
	}
}
