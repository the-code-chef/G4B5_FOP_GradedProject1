package com.gl.management.driver;

import com.gl.management.departments.AdminDepartment;
import com.gl.management.departments.HrDepartment;
import com.gl.management.departments.SuperDepartment;
import com.gl.management.departments.TechDepartment;

public class Main {
	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		String s = "Welcome to";
		System.out.println(s+" "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
	
		
		System.out.println();
		
		System.out.println(s+" "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(s+" "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
