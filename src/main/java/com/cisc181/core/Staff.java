package com.cisc181.core;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	private eTitle Title;


/**
     * Staff no-arg constructor
     */
	/*
	public Staff() {
	}*/
	
    /**
     * <b>Staff Constructor</b> - Creates an instance of Staff
     * @param FirstName
     * @param MiddleName
     * @param LastName
     * @param DOB
     * @param Address
     * @param Phone_number
     * @param Email
     * @param office
     * @param salary
     * @param hire
     * @param title
     */
	
	public Staff(String FirstName, String MiddleName, String LastName, Date DOB, String Address, String Phone_number,
			String Email, String officeHours, int rank, double salary, Date hireDate, eTitle Title)

	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email, officeHours, salary, hireDate);

		this.Title = Title;
	}
	

    
	
 

	
	public void setTitle(eTitle title) {
		this.Title = title;
	}

	public eTitle getTitle() {
		return this.Title;
	}
	

}