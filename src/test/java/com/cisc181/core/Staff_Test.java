package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	/*
	 * public static void main(String args[]) { Staff staff1 = new Staff("Jim",
	 * "Jack", "Smith", Calendar.getInstance(), "94 Apple Road",
	 * "(302)-888-7848", "smith@aol.com", "11-12 PM", 1, 32000,
	 * Calendar.getInstance(), eTitle.MR);
	 * 
	 * 
	 * System.out.println (staff.get(i).getSalary());
	 * 
	 * public static void computeAverageSalaryOfStaff(ArrayList<Staff>
	 * stafflist) { int totalAmount = 0;
	 * 
	 * int size = staffList.size(); for (int i = 0; i < stafflist.size(); i++) {
	 * int totalSalary = stafflist.get(i).computeTotalSalary(); totalAmount =
	 * +totalSalary; System.out.println(totalAmount / size); }
	 */
}
